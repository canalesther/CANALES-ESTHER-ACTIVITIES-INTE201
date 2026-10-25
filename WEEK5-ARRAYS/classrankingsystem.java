/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package WEEK5;

public class classrankingsystem {
    
    public static void main(String[] args) {
        
        System.out.println("====================");
        System.out.println("CLASS RANKING SYSTEM");
        System.out.println("====================");
        
        System.out.println();
        
        String[][] quizData = {
            {"Esther", "95", "90", "88", "92"},
            {"Joshua", "85", "80", "90", "85"},
            {"Daniel", "95", "90", "88", "92"},
            {"Maria", "75", "80", "78", "82"},
            {"Sophia", "88", "85", "90", "87"}
        };

        Student[] classList = new Student[quizData.length];

        for (int i = 0; i < quizData.length; i++) {

            String studentName = quizData[i][0];

            int[] quizScores = new int[4];

            for (int j = 0; j < 4; j++) {
                quizScores[j] = Integer.parseInt(quizData[i][j + 1]);
            }

            classList[i] = new Student(studentName, quizScores);
        }

        // Bubble Sort: highest average to lowest average
        for (int i = 0; i < classList.length - 1; i++) {

            for (int j = 0; j < classList.length - 1 - i; j++) {

                if (classList[j].getAverage()
                        < classList[j + 1].getAverage()) {

                    Student temp = classList[j];
                    classList[j] = classList[j + 1];
                    classList[j + 1] = temp;
                }
            }
        }

        System.out.println("\n       CLASS RANKING");

        System.out.println("Rank\tName\t\tAverage");
        System.out.println("--------------------------------");

        int currentRank = 1;

        for (int i = 0; i < classList.length; i++) {

            if (i > 0 && Double.compare(
                    classList[i].getAverage(),
                    classList[i - 1].getAverage()) != 0) {

                currentRank = i + 1;
            }

            System.out.printf(
                "%d\t%-15s %.2f%n",
                currentRank,
                classList[i].name,
                classList[i].getAverage()
            );
        }

        String targetName = "Joshua";

        int foundRank = findRank(classList, targetName);

        System.out.println("\nSearching for student: " + targetName);

        if (foundRank != -1) {
            System.out.println(targetName + "'s Rank: " + foundRank);
        } else {
            System.out.println("Student not found.");
        }
    }

    static class Student {

        String name;
        int[] quizScores;

        Student(String name, int[] quizScores) {
            this.name = name;
            this.quizScores = quizScores;
        }

        double getAverage() {

            int totalScore = 0;

            for (int i = 0; i < quizScores.length; i++) {
                totalScore += quizScores[i];
            }

            return (double) totalScore / quizScores.length;
        }
    }

    // Linear Search: finds a student's rank by name
    static int findRank(Student[] classList, String targetName) {

        for (int i = 0; i < classList.length; i++) {

            if (classList[i].name.equalsIgnoreCase(targetName)) {

                int studentRank = 1;

                for (int j = 0; j < i; j++) {

                    if (classList[j].getAverage()
                            > classList[i].getAverage()) {
                        studentRank++;
                    }
                }

                return studentRank;
            }
        }

        return -1;
    }
}

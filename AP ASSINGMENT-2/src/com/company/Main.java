package com.company;


import java.util.Date;
import java.util.LinkedList;
import java.util.Scanner;

abstract class class_material {
    String tos;
    int nos;
    String tov;
    String fov;
    Date date;
    int instructor;
    LinkedList content;


}

interface material {
    void slide();
}


class lecture_slide extends class_material implements material {
    public lecture_slide(String tos, int nos, Date date, int instructor, LinkedList content) {


        this.tos = tos;
        this.nos = nos;
        this.date = date;
        this.instructor = instructor;
        this.content = content;
    }

    public void slide() {
        this.tos = tos;
    }
}

class lecture_video extends class_material {

    public lecture_video(String tov, String fov, Date date, int instructor) {
        this.tov = tov;
        this.fov = fov;
        this.date = date;
        this.instructor = instructor;

    }

}

abstract class assessments {
    String assingment, quiz;
    int marks;


}

class assingment extends assessments {


    public assingment(String assingment, int marks) {
        this.assingment = assingment;
        this.marks = marks;
    }
}

class quiz extends assessments {
    public quiz(String quiz) {
        this.quiz = quiz;
    }
}

class submitassing {
    String filename, extension;

    public submitassing(String filename, String extension) {
        this.filename = filename;
        this.extension = extension;
    }
}

class commentinstr {
    String comment;
    int x;
    Date date;

    public commentinstr(String comment, int x, Date date) {
        this.comment = comment;
        this.x = x;
        this.date = date;
    }
}

class commentstud {
    String comment;
    int x;
    Date date;

    public commentstud(String comment, int x, Date date) {
        this.comment = comment;
        this.x = x;
        this.date = date;
    }
}


public class Main {

    public static void main(String[] args) {
        // write your code here
        LinkedList<class_material> lecture_slide = new LinkedList<>();
        LinkedList<class_material> lecture_video = new LinkedList<>();
        LinkedList<assessments> assingment = new LinkedList<>();
        LinkedList<assessments> quiz = new LinkedList<>();
        LinkedList<assessments> assingments0 = new LinkedList<>();
        LinkedList<assessments> quizs0 = new LinkedList<>();
        LinkedList<assessments> assingments1 = new LinkedList<>();
        LinkedList<assessments> quizs1 = new LinkedList<>();
        LinkedList<submitassing> submitassings0 = new LinkedList<>();
        LinkedList<submitassing> submitassings1 = new LinkedList<>();
        LinkedList<submitassing> submitassings = new LinkedList<>();
        LinkedList<commentinstr> com = new LinkedList<>();
        LinkedList<commentstud> comstud = new LinkedList<>();

        System.out.println("Welcome to Backpack\n" +
                "1. Enter as instructor\n" +
                "2. Enter as student\n" +
                "3. Exit");
        Scanner scn = new Scanner(System.in);
        while (true) {
            int opt = scn.nextInt();
            if (opt == 1) {
                System.out.print("Instructors:\n" +
                        "0 - I0\n" +
                        "1 - I1\n" +
                        "Choose id:");
                int x = scn.nextInt();
//            if (x == 0) {
                for (int z = 0; z <= x; z++) {
                    if (x == z) {
                        System.out.println("Welcome I" + z);
                        System.out.println("INSTRUCTOR MENU\n" +
                                "1. Add class material\n" +
                                "2. Add assessments\n" +
                                "3. View lecture materials\n" +
                                "4. View assessments\n" +
                                "5. Grade assessments\n" +
                                "6. Close assessment\n" +
                                "7. View comments\n" +
                                "8. Add comments\n" +
                                "9. Logout");
                        while (true) {
                            int menuopt = scn.nextInt();
                            if (menuopt == 1) {
                                System.out.println("1. Add Lecture Slide\n" +
                                        "2. Add Lecture Video");
                                int q = scn.nextInt();
                                if (q == 1) {


                                    System.out.print("Enter topic of slides:");
                                    String tos = scn.next();

                                    Date date = new Date();
                                    System.out.print("Enter number of slides:");
                                    int nos = scn.nextInt();
                                    //    String z = "a";
                                    System.out.println("enter content of slides");
                                    //  String[] arr = new String[nos];
                                    LinkedList content = new LinkedList();

                                    for (int i = 0; i < nos; i++) {
                                        System.out.print("content of slide " + (i + 1) + ":");
                                        String cos = scn.next();

                                        content.add("Slide " + (i + 1) + ": " + cos + "\n");
                                        // arr[i] = cos;
                                    }
                                    //    Collections.addAll(lecture_slide, arr);

                                    lecture_slide.add(new lecture_slide(tos, nos, date, x, content));
                                    System.out.println("Welcome I" + z);
                                    System.out.println("INSTRUCTOR MENU\n" +
                                            "1. Add class material\n" +
                                            "2. Add assessments\n" +
                                            "3. View lecture materials\n" +
                                            "4. View assessments\n" +
                                            "5. Grade assessments\n" +
                                            "6. Close assessment\n" +
                                            "7. View comments\n" +
                                            "8. Add comments\n" +
                                            "9. Logout");
                                }
                                if (q == 2) {


                                    System.out.print("Enter topic of video:");
                                    String tov = scn.next();

                                    System.out.print("Enter filename of video:");
                                    String fov = scn.next();

                                    String fov1 = fov.substring(fov.length() - 4);

                                    if (fov1.equals(".mp4")) {
                                        System.out.println("added");
                                        Date date = new Date();
                                        lecture_video.add(new lecture_video(tov, fov, date, x));
                                    } else if (fov1 != ".mp4") {
                                        System.out.println("Invalid video file");
                                    }
                                    System.out.println("Welcome I" + z);
                                    System.out.println("INSTRUCTOR MENU\n" +
                                            "1. Add class material\n" +
                                            "2. Add assessments\n" +
                                            "3. View lecture materials\n" +
                                            "4. View assessments\n" +
                                            "5. Grade assessments\n" +
                                            "6. Close assessment\n" +
                                            "7. View comments\n" +
                                            "8. Add comments\n" +
                                            "9. Logout");

                                }
                            }
                            if (menuopt == 3) {


                                for (int i = 0; i < lecture_slide.size(); i++) {
                                    System.out.println("TITLE: " + lecture_slide.get(i).tos);
                                    System.out.println(lecture_slide.get(i).content);
                                    //    System.out.println();
                                    System.out.println("Number of slides: " + lecture_slide.get(i).nos);
                                    System.out.println("Date of upload: " + lecture_slide.get(i).date);
                                    System.out.println("Uploaded by: I" + lecture_slide.get(i).instructor + "\n");

                                }
//                        if (q == 2) {
                                for (int i = 0; i < lecture_video.size(); i++) {
                                    System.out.println("Title of video: " + lecture_video.get(i).tov + "\n" + "Videofile: " + lecture_video.get(i).fov + "\n" + "Date of upload: " + lecture_video.get(i).date);
                                    System.out.println("Uploaded by: I" + lecture_video.get(i).instructor + "\n");
                                }
//                        }
                                System.out.println("Welcome I" + z);
                                System.out.println("INSTRUCTOR MENU\n" +
                                        "1. Add class material\n" +
                                        "2. Add assessments\n" +
                                        "3. View lecture materials\n" +
                                        "4. View assessments\n" +
                                        "5. Grade assessments\n" +
                                        "6. Close assessment\n" +
                                        "7. View comments\n" +
                                        "8. Add comments\n" +
                                        "9. Logout");

                            }
                            if (menuopt == 2) {
                                System.out.println("1. Add Assignment\n" +
                                        "2. Add Quiz");
                                int ass = scn.nextInt();
                                if (ass == 1) {

                                    System.out.print("Enter problem statement:");
                                    String probst = scn.nextLine();
                                    probst += scn.nextLine();
                                    System.out.println("Enter max marks: ");
                                    int maxmarks = scn.nextInt();
                                    assingment.add(new assingment(probst, maxmarks));
                                    assingments0.add(new assingment(probst, maxmarks));
                                    assingments1.add(new assingment(probst, maxmarks));
                                    //assingments2.add(new assingment(probst,maxmarks));


                                }
                                if (ass == 2) {
                                    System.out.println("Enter quiz question:");
                                    String qq = scn.nextLine();
                                    qq += scn.nextLine();
                                    quiz.add(new quiz(qq));
                                    quizs0.add(new quiz(qq));
                                    quizs1.add(new quiz(qq));

                                }
//                                assessment.add(new assessments())
                                System.out.println("Welcome I" + z);
                                System.out.println("INSTRUCTOR MENU\n" +
                                        "1. Add class material\n" +
                                        "2. Add assessments\n" +
                                        "3. View lecture materials\n" +
                                        "4. View assessments\n" +
                                        "5. Grade assessments\n" +
                                        "6. Close assessment\n" +
                                        "7. View comments\n" +
                                        "8. Add comments\n" +
                                        "9. Logout");
                            }
                            if (menuopt == 5) {
                                System.out.println("List of assessments");
                                int count = 0;
                                for (int i = 0; i < assingment.size(); i++) {
                                    System.out.println("ID " + count + " ASSIGNMENT: " + assingment.get(count).assingment + " MAX MARKS: " + assingment.get(count).marks);
                                    count += 1;

                                    //  for(int j=)
                                }
                                int newcount = 0;
                                for (int i = 0; i < quiz.size(); i++) {
                                    System.out.println("ID " + (count + newcount) + " QUESTION: " + quiz.get(i).quiz);
                                    //   count+=1;
                                    newcount += 1;
                                }
                                System.out.println("Enter ID of assessment to view submissions:");
                                int idos = scn.nextInt();
                                int countz = 0;
                                for (int i = 0; i < assingment.size(); i++) {
                                    if (idos == i) {
                                        System.out.println("Choose ID from these ungraded submissions");
                                        if (submitassings0.size() > 0) {
                                            System.out.println("0. " + "S0");
                                        }
                                        if (submitassings1.size() > 0) {
                                            System.out.println("1. " + "S1");
                                        }
                                        if (submitassings.size() > 0) {
                                            System.out.println("2. " + "S2");
                                        }
                                        int subid = scn.nextInt();

                                        if (subid == 0) {
                                            for (int j = 0; j < submitassings0.size(); j++) {


                                                System.out.println("SUBMISSION: " + submitassings0.get(j).filename);
                                                System.out.println("-------------------------------");
                                                System.out.println("MAXMARKS: " + assingments0.get(j).marks);
                                                System.out.println("Marks scored:");
                                                int marks0 = scn.nextInt();
                                            }
                                        }
                                        if (subid == 1) {
                                            for (int j = 0; j < submitassings1.size(); j++) {
                                                System.out.println("SUBMISSION: " + submitassings1.get(j).filename);
                                                System.out.println("-------------------------------");
                                                System.out.println("MAXMARKS: " + assingments1.get(j).marks);
                                                System.out.println("Marks scored:");
                                                int marks1 = scn.nextInt();
                                            }
                                        }
                                        if (subid == 2) {
                                            for (int j = 0; j < submitassings.size(); j++) {

                                                System.out.println("SUBMISSION: " + submitassings.get(j).filename);
                                                System.out.println("-------------------------------");
                                                System.out.println("MAXMARKS: " + assingment.get(j).marks);
                                                System.out.println("Marks scored:");
                                                int marks = scn.nextInt();
                                            }
                                        }
                                    }
                                    //  countz += 1;
                                }
                                System.out.println("Welcome I" + z);
                                System.out.println("INSTRUCTOR MENU\n" +
                                        "1. Add class material\n" +
                                        "2. Add assessments\n" +
                                        "3. View lecture materials\n" +
                                        "4. View assessments\n" +
                                        "5. Grade assessments\n" +
                                        "6. Close assessment\n" +
                                        "7. View comments\n" +
                                        "8. Add comments\n" +
                                        "9. Logout");


                            }
//                            if(menuopt==6){
//                                System.out.println("List of Open Assignments:");
//
//                            }
                            if (menuopt == 7) {
                                for (int i = 0; i < com.size(); i++) {
                                    System.out.println(com.get(i).comment + " -I" + com.get(i).x);
                                    System.out.println(com.get(i).date + "\n");
                                }
                                for (int i = 0; i < comstud.size(); i++) {
                                    System.out.println(comstud.get(i).comment + " -I" + comstud.get(i).x);
                                    System.out.println(comstud.get(i).date);

                                }

                            }
                            if (menuopt == 8) {
                                System.out.println("Enter comment:");
                                String comment = scn.nextLine();
                                comment += scn.nextLine();
                                Date date = new Date();
                                com.add(new commentinstr(comment, z, date));
                                System.out.println("Welcome I" + z);
                                System.out.println("INSTRUCTOR MENU\n" +
                                        "1. Add class material\n" +
                                        "2. Add assessments\n" +
                                        "3. View lecture materials\n" +
                                        "4. View assessments\n" +
                                        "5. Grade assessments\n" +
                                        "6. Close assessment\n" +
                                        "7. View comments\n" +
                                        "8. Add comments\n" +
                                        "9. Logout");
                            }
                            if (menuopt == 9) {
                                System.out.println("Welcome to Backpack\n" +
                                        "1. Enter as instructor\n" +
                                        "2. Enter as student\n" +
                                        "3. Exit");
                                break;
                            }
                        }
                    }


                }
            }
            if (opt == 2) {
                System.out.println("Students:\n" +
                        "0 - S0\n" +
                        "1 - S1\n" +
                        "2 - S2\n" +
                        "Choose id: ");
                int cid = scn.nextInt();
                for (int x = 0; x <= 2; x++) {
                    if (cid == x) {

                        System.out.println("Welcome S" + x);
                        System.out.println("STUDENT MENU\n" +
                                "1. View lecture materials\n" +
                                "2. View assessments\n" +
                                "3. Submit assessment\n" +
                                "4. View grades\n" +
                                "5. View comments\n" +
                                "6. Add comments\n" +
                                "7. Logout");
                        while (true) {
                            int menuopt1 = scn.nextInt();
                            if (menuopt1 == 1) {


                                for (int i = 0; i < lecture_slide.size(); i++) {
                                    System.out.println("TITLE: " + lecture_slide.get(i).tos);
                                    System.out.println(lecture_slide.get(i).content);
                                    //    System.out.println();
                                    System.out.println("Number of slides: " + lecture_slide.get(i).nos);
                                    System.out.println("Date of upload: " + lecture_slide.get(i).date);
                                    System.out.println("Uploaded by: I" + lecture_slide.get(i).instructor + "\n");

                                }
//                        if (q == 2) {
                                for (int i = 0; i < lecture_video.size(); i++) {
                                    System.out.println("Title of video: " + lecture_video.get(i).tov + "\n" + "Videofile: " + lecture_video.get(i).fov + "\n" + "Date of upload: " + lecture_video.get(i).date);
                                    System.out.println("Uploaded by: I" + lecture_video.get(i).instructor + "\n");
                                }
//                        }
                                System.out.println("Welcome S" + x);
                                System.out.println("STUDENT MENU\n" +
                                        "1. View lecture materials\n" +
                                        "2. View assessments\n" +
                                        "3. Submit assessment\n" +
                                        "4. View grades\n" +
                                        "5. View comments\n" +
                                        "6. Add comments\n" +
                                        "7. Logout");
                            }
                            if (menuopt1 == 3) {
//                                if(cid)
                                System.out.println("Pending assessments");
                                int count = 0;
                                if (cid == 0) {
                                    for (int i = 0; i < assingments0.size(); i++) {
                                        System.out.println("ID " + count + " ASSINGMENT: " + assingments0.get(count).assingment + " MAX MARKS: " + assingments0.get(count).marks);
                                        count += 1;

                                        //  for(int j=)
                                    }
                                    int newcount = 0;
                                    for (int i = 0; i < quizs0.size(); i++) {
                                        System.out.println("ID " + (count + newcount) + " QUESTION: " + quizs0.get(i).quiz);
                                        newcount += 1;
                                    }

                                    System.out.println("Enter ID of assessment: ");
                                    int ids = scn.nextInt();
                                    String filename;
                                    int check = 0;

//                                filename+=scn.nextLine();
                                    for (int i = 0; i < assingments0.size(); i++) {
                                        if (ids == i) {
                                            System.out.println("Enter filename of assignment: ");
                                            filename = scn.nextLine();
                                            filename += scn.nextLine();
                                            if (filename.length() > 4) {
                                                String filename1 = filename.substring(filename.length() - 4);
                                                if (filename1.equals(".zip")) {
                                                    System.out.println("added");
                                                    submitassings0.add(new submitassing(filename, filename1));
                                                    check = 1;

                                                } else if (filename1 != ".zip") {
                                                    System.out.println("Invalid file format");
                                                }
                                            } else {
                                                System.out.println("Invalid file format");
                                            }
                                        }
                                        if (check == 1) {
                                            assingments0.remove(i);
                                        }

                                    }
                                    int check1 = 0;
                                    for (int i = 0; i < quizs0.size(); i++) {
                                        if ((ids - count) == i) {
                                            System.out.println(quizs0.get((ids - count)).quiz);
                                            String quizans = scn.nextLine();
                                            quizans += scn.nextLine();
                                            check1 = 1;


                                        }
                                        if (check1 == 1) {
                                            quizs0.remove((ids - count));
                                        }
                                    }
                                }


                                if (cid == 1) {
                                    for (int i = 0; i < assingments1.size(); i++) {
                                        System.out.println("ID " + count + " ASSINGMENT: " + assingments1.get(count).assingment + " MAX MARKS: " + assingments1.get(count).marks);
                                        count += 1;

                                        //  for(int j=)
                                    }
                                    int newcount = 0;
                                    for (int i = 0; i < quizs1.size(); i++) {
                                        System.out.println("ID " + (count + newcount) + " QUESTION: " + quizs1.get(i).quiz);
                                        newcount += 1;
                                    }

                                    System.out.println("Enter ID of assessment: ");
                                    int ids = scn.nextInt();
                                    String filename;
                                    int check = 0;

//                                filename+=scn.nextLine();
                                    for (int i = 0; i < assingments1.size(); i++) {
                                        if (ids == i) {
                                            System.out.println("Enter filename of assignment: ");
                                            filename = scn.nextLine();
                                            filename += scn.nextLine();
                                            if (filename.length() > 4) {
                                                String filename1 = filename.substring(filename.length() - 4);
                                                if (filename1.equals(".zip")) {
                                                    System.out.println("added");
                                                    submitassings1.add(new submitassing(filename, filename1));
                                                    check = 1;
                                                    //     Date date = new Date();
                                                    //lecture_video.add(new lecture_video(tov, fov, date, x));
                                                } else if (filename1 != ".zip") {
                                                    System.out.println("Invalid file format");
                                                }
                                            } else {
                                                System.out.println("Invalid file format");
                                            }
                                        }
                                        if (check == 1) {
                                            assingments1.remove(i);
                                        }

                                    }
                                    int check1 = 0;
                                    for (int i = 0; i < quizs1.size(); i++) {
                                        if ((ids - count) == i) {
                                            System.out.println(quizs1.get((ids - count)).quiz);
                                            String quizans = scn.nextLine();
                                            quizans += scn.nextLine();
                                            check1 = 1;


                                        }
                                        if (check1 == 1) {
                                            quizs1.remove((ids - count));
                                        }
                                    }
                                }


                                if (cid == 2) {
                                    for (int i = 0; i < assingment.size(); i++) {
                                        System.out.println("ID " + count + " ASSINGMENT: " + assingment.get(count).assingment + " MAX MARKS: " + assingment.get(count).marks);
                                        count += 1;

                                        //  for(int j=)
                                    }
                                    int newcount = 0;
                                    for (int i = 0; i < quiz.size(); i++) {
                                        System.out.println("ID " + (count + newcount) + " QUESTION: " + quiz.get(i).quiz);
                                        newcount += 1;
                                    }

                                    System.out.println("Enter ID of assessment: ");
                                    int ids = scn.nextInt();
                                    String filename;
                                    int check = 0;

//                                filename+=scn.nextLine();
                                    for (int i = 0; i < assingment.size(); i++) {
                                        if (ids == i) {
                                            System.out.println("Enter filename of assignment: ");
                                            filename = scn.nextLine();
                                            filename += scn.nextLine();
                                            if (filename.length() > 4) {
                                                String filename1 = filename.substring(filename.length() - 4);
                                                if (filename1.equals(".zip")) {
                                                    System.out.println("added");
                                                    submitassings.add(new submitassing(filename, filename1));
                                                    check = 1;
                                                    //     Date date = new Date();
                                                    //lecture_video.add(new lecture_video(tov, fov, date, x));
                                                } else if (filename1 != ".zip") {
                                                    System.out.println("Invalid file format");
                                                }
                                            } else {
                                                System.out.println("Invalid file format");
                                            }
                                        }
                                        if (check == 1) {
                                            assingment.remove(i);
                                        }

                                    }
                                    int check1 = 0;
                                    for (int i = 0; i < quiz.size(); i++) {
                                        if ((ids - count) == i) {
                                            System.out.println(quiz.get((ids - count)).quiz);
                                            String quizans = scn.nextLine();
                                            quizans += scn.nextLine();
                                            check1 = 1;


                                        }
                                        if (check1 == 1) {
                                            quiz.remove((ids - count));
                                        }
                                    }
                                }
                                System.out.println("Welcome S" + x);
                                System.out.println("STUDENT MENU\n" +
                                        "1. View lecture materials\n" +
                                        "2. View assessments\n" +
                                        "3. Submit assessment\n" +
                                        "4. View grades\n" +
                                        "5. View comments\n" +
                                        "6. Add comments\n" +
                                        "7. Logout");
//                                if(ids==count){
//
//                                }
                            }
                            if (menuopt1 == 6) {
                                System.out.println("Enter comment:");
                                String comment = scn.nextLine();
                                comment += scn.nextLine();
                                Date date = new Date();
                                comstud.add(new commentstud(comment, x, date));
                                System.out.println("Welcome S" + x);
                                System.out.println("STUDENT MENU\n" +
                                        "1. View lecture materials\n" +
                                        "2. View assessments\n" +
                                        "3. Submit assessment\n" +
                                        "4. View grades\n" +
                                        "5. View comments\n" +
                                        "6. Add comments\n" +
                                        "7. Logout");
                            }
                            if (menuopt1 == 5) {
                                //    System.out.println(com.get);
                                for (int i = 0; i < com.size(); i++) {
                                    System.out.println(com.get(i).comment + " -I" + com.get(i).x);
                                    System.out.println(com.get(i).date + "\n");
                                }
                                for (int i = 0; i < comstud.size(); i++) {
                                    System.out.println(comstud.get(i).comment + " -S" + comstud.get(i).x);
                                    System.out.println(comstud.get(i).date);

                                }
                            }
                            if (menuopt1 == 7) {
                                System.out.println("Welcome to Backpack\n" +
                                        "1. Enter as instructor\n" +
                                        "2. Enter as student\n" +
                                        "3. Exit");
                                break;
                            }
                        }
                    }
                }
            }
            if (opt == 3) {
                System.out.println("-------------------------------------------------------------------------------------------------\n" +
                        "{End of Test Case}");
            }
        }

    }
}

package com.day05.dome005;

import com.day05.dome05.ScoreUnusualException;

/**
 * @author 冯朋举
 * @date 2018/12/16 18:20
 */
public class Student {
    private String name;
    private int trainee;
    private int score;

    public Student() {
    }

    public Student(String name, int trainee, int score) throws ScoreUnusualException {
        if (score<0||score>100){
            throw new ScoreUnusualException("分数不合理！！！！");
        }
        this.name = name;
        this.trainee = trainee;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTrainee() {
        return trainee;
    }

    public void setTrainee(int trainee) {
        this.trainee = trainee;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) throws ScoreUnusualException {
        if (score<0||score>100){
            throw new ScoreUnusualException("分数不合理！！！！");
        }
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", trainee=" + trainee +
                ", score=" + score +
                '}';
    }
}

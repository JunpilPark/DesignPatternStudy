package com.example.template;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Tea extends CaffeinBeverageWithHook {

    @Override
    public void brew() {
        System.out.println("차를 우려내는 중");
    }

    @Override
    public void addCodiments() {
        System.out.println("레몬을 추가하는 중");
    }


    @Override
    public boolean customerWantsCondiments() {
        String answer = getUserInput();

        if(answer.toLowerCase().startsWith("y") == true) {
            return true;
        }
        else {
            return false;
        }
    }

    private String getUserInput() {
        String answer = null;

        System.out.print("차에 레몬을 추가해 드릴까요? (y/n) ");
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        try{
            answer = in.readLine();
        }
        catch (IOException ioe) {
            System.out.println("IO 오류 : " + ioe.getMessage());
        }

        if(answer == null) {
            return "no";
        }
        return answer;
    }

}

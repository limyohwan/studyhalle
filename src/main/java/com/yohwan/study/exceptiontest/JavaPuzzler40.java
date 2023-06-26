package com.yohwan.study.exceptiontest;

import java.io.*;

public class JavaPuzzler40 {
    static void copy(String src, String dest) throws IOException {
        InputStream in = null;
        OutputStream out = null;
        try {
            in = new FileInputStream(src);
            out = new FileOutputStream(dest);
            byte[] buf = new byte[1024];
            int n;
            while((n = in.read(buf)) >= 0){
                out.write(buf, 0, n);
            }
        } finally {
            if(in != null) {
                in.close();// in.close하는 부분도 try catch로 잡아주어야 다음 out.close하는 부분으로 내려가 자원을 종료할 수 있음, 만약 에러가 던져지면 out의 자원은 종료되지 못하고 자원 누수가 발생됨
            }

            if(out != null) {
                out.close();
            }
        }
    }

    //try catch finally
    static void copy2(String src, String dest) throws IOException {
        InputStream in = null;
        OutputStream out = null;
        try {
            out = new FileOutputStream(dest);
            try {
                in = new FileInputStream(src);
                byte[] buf = new byte[1024];
                int n;
                while((n = in.read(buf)) >= 0){
                    out.write(buf, 0, n);
                }
            } finally {
                if(in != null) {
                    try {
                        in.close();
                    } catch (IOException e) {
                        // 예외
                    }
                }
            }
        } finally {
            if(out != null) {
                try {
                    out.close();
                } catch (IOException e) {
                    // 예외
                }
            }
        }
    }

    // try with resources
    static void copy3(String src, String dest) {
        try (InputStream in =  new FileInputStream(src); OutputStream out = new FileOutputStream(dest)){
            byte[] buf = new byte[1024];
            int n;
            while((n = in.read(buf)) >= 0){
                out.write(buf, 0, n);
            }
        } catch (IOException e) { // 에러를 잡거나 던지거나
            //에러처리
        } finally {
            // finally 구문도 추가적으로 사용 가능 -> try with resources는 finally 블록에서 close 로직을 생성하는게 아니라 catch 블록에서 close하는 로직을 생성해주고 또 맨 밑에 close하는 로직을 추가로 생성해줌
        }
    }

}

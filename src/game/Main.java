package game;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        JOptionPane.showMessageDialog(null, "손가락 운동 시작");

        for (int i = 1000; i > 0; i--) {

            if (i == 1000) {
                JOptionPane.showMessageDialog(null, "중간에 메시지도 있으니까 확인좀 잘 해봐. 나가는데 도움이 될 수 있어");
            }

            else if (i == 900) {
                JOptionPane.showMessageDialog(null, "열심히 해봐");
            }

            else if (i == 800) {
                JOptionPane.showMessageDialog(null, "'당신은 손가락이 아픈걸 느꼈다'");
            }

            else if(i == 700) {
                JOptionPane.showMessageDialog(null, "나가는법을 알고싶어?");
            }

            else if(i == 600) {
                JOptionPane.showMessageDialog(null, "그게 뭐냐면......");
            }

            else if(i == 500){
                JOptionPane.showMessageDialog(null, "그것은........");
            }

            else if (i == 400) {
                JOptionPane.showMessageDialog(null, "이걸 다 누르는수 밖에 없어");
            }

            else if(i == 300) {
                JOptionPane.showMessageDialog(null, "다음대사가 궁금했어?");
            }

            else if(i == 200) {
                JOptionPane.showMessageDialog(null, "사실 끄는 방법이 하나 더 있는데..");
            }
            else if(i == 100) {
                JOptionPane.showMessageDialog(null, "알려주기 긿어");
            }

            else {
                JOptionPane.showMessageDialog(null, i + "번 남았어");
            }
        }

        JOptionPane.showMessageDialog(null, "그래 끝이야");
        JOptionPane.showMessageDialog(null, "이게 결말이야");
        JOptionPane.showMessageDialog(null, "짜증나도..");
        JOptionPane.showMessageDialog(null, "이건 삭제하지마");
        JOptionPane.showMessageDialog(null, "THE END");
    }

}



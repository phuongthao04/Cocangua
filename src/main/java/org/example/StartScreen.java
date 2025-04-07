package org.example;

import javax.swing.*;
import java.awt.*;

public class StartScreen extends JFrame {
    public StartScreen() {
        setTitle("Cờ Cá Ngựa");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false); // Không cho phép thay đổi kích thước

        // Kích thước mong muốn cho JFrame
        int frameWidth = 400;  // Điều chỉnh theo mong muốn
        int frameHeight = 650;

        // Load ảnh gốc
        ImageIcon originalIcon = new ImageIcon("src/images/start_sc.png");
        if (originalIcon.getIconWidth() == -1) {
            System.out.println("Lỗi: Không tìm thấy ảnh!");
            return;
        }

        // Resize ảnh về kích thước mong muốn
        Image scaledImage = originalIcon.getImage().getScaledInstance(frameWidth, frameHeight, Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(scaledImage);

        // Cài đặt kích thước JFrame đúng bằng ảnh đã thu nhỏ
        setSize(frameWidth, frameHeight);
        setLocationRelativeTo(null); // Hiển thị ở giữa màn hình
        setLayout(null); // Tắt layout để tự đặt vị trí

        // Hiển thị ảnh nền
        JLabel background = new JLabel(scaledIcon);
        background.setBounds(0, 0, frameWidth, frameHeight);
        add(background);

        // Button "TIẾP TỤC"
        JButton btnContinue = new JButton("TIẾP TỤC");
        btnContinue.setBounds(frameWidth / 4, frameHeight - 270, frameWidth / 2, 50);
        btnContinue.setBackground(new Color(180, 255, 120));
        background.add(btnContinue);

        // Button "VÁN MỚI"
        JButton btnNewGame = new JButton("VÁN MỚI");
        btnNewGame.setBounds(frameWidth / 4, frameHeight - 200, frameWidth / 2, 50);
        btnNewGame.setBackground(new Color(180, 255, 120));
        background.add(btnNewGame);

        setVisible(true); // Hiển thị cửa sổ
    }

    public static void main(String[] args) {
        new StartScreen(); // Chạy màn hình bắt đầu
    }
}

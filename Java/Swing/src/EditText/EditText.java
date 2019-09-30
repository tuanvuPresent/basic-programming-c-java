/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EditText;

import java.awt.ComponentOrientation;
import java.awt.ScrollPane;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPopupMenu;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

/**
 *
 * @author NguyenTuanVu
 */
public class EditText implements ActionListener {

    private JButton bt;
    private JMenuBar menu;
    private JMenuItem New, Open, Save, Exit, About, copy, paste;
    private JMenu File1, Edit;
    private JTextArea area;
    private javax.swing.JScrollPane jScrollPane;
    private static final int FILE_OPEN = 1;
    private static final int FILE_SAVE = 0;

    public EditText() {
        JFrame frame = new JFrame();
//        frame.setLayout(null);                                       //hien 
        frame.setSize(400, 500);                                     //set kich thuoc
        frame.setTitle("Even Key Mouse");                            //tieu de
        frame.setLocationRelativeTo(null);                           //man hinh ra giua
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);        //exit khi bam x
        frame.setResizable(false);                                   //khong cho phong to
        //add menu
        menu = new JMenuBar();
        frame.setJMenuBar(menu);

        File1 = new JMenu("File");
        File1.setMnemonic(KeyEvent.VK_F);
        menu.add(File1);

        Edit = new JMenu("Edit");
        Edit.setMnemonic(KeyEvent.VK_E);
        menu.add(Edit);

        New = new JMenuItem("New");
        New.setMnemonic(KeyEvent.VK_N);
        File1.add(New);

        Open = new JMenuItem("Open");
        Open.setMnemonic(KeyEvent.VK_O);
        File1.add(Open);

        File1.addSeparator();    //hien duong ke

        Save = new JMenuItem("Save");
        Save.setMnemonic(KeyEvent.VK_S);
        File1.add(Save);

        Exit = new JMenuItem("Exit");
        Exit.setMnemonic(KeyEvent.VK_E);
        Edit.add(Exit);

        About = new JMenuItem("About");
        About.setMnemonic(KeyEvent.VK_A);
        Edit.add(About);
        About.addActionListener(this);

        //add area
        area = new JTextArea(10, 10);
        area.setLineWrap(true);
        area.setWrapStyleWord(true);

        JScrollPane scroll = new JScrollPane(area);
        frame.add(scroll);

        //event mouse
        JPopupMenu pop = new JPopupMenu();
        copy = new JMenuItem("copy");
        paste = new JMenuItem("paste");
        pop.add(copy);
        pop.add(paste);
        area.setComponentPopupMenu(pop);
        area.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);

        copy.addActionListener(this);
        paste.addActionListener(this);

        frame.setVisible(true);
        //------------------------------------------add click--------------------------------------------
        Exit.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                actionExit();
            }
        });
        Save.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                evenFile("save file", FILE_SAVE);
            }
        });
        Open.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                if (area.getText().equals("")) {
                    evenFile("open file", FILE_OPEN);
                } else {
                    openNewFile();
                }
            }
        });
        New.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                if (!area.getText().equals("")) {
                    newFile();
                } else {
                    area.setText("");
                }
            }
        });
    }

    private void newFile() {
        int result = JOptionPane.showConfirmDialog(null, "Bạn có muốn Save không", "New", 1);
        if (result == JOptionPane.NO_OPTION) {
            area.setText(null);
        } else if (result == JOptionPane.YES_OPTION) {
            evenFile("Save file", FILE_SAVE);
        }
    }

    private void openNewFile() {
        int result = JOptionPane.showConfirmDialog(null, "Bạn có muốn Save không", "Open", 1);
        if (result == JOptionPane.NO_OPTION) {
            evenFile("Open file", FILE_OPEN);
        } else if (result == JOptionPane.YES_OPTION) {
            evenFile("Save file", FILE_SAVE);
        }
    }

    private void actionExit() {
        int result = JOptionPane.showConfirmDialog(null, "Bạn có muốn Save không", "Exit", 1);
        if (result == JOptionPane.NO_OPTION) {
            System.exit(0);
        } else if (result == JOptionPane.YES_OPTION) {
            evenFile("Save file", FILE_SAVE);
        }
    }

    private void evenFile(String title, int type) {
        JFileChooser chooser = new JFileChooser();
        chooser.setDialogTitle(title);
        int chs = -1;
        switch (type) {
            case FILE_OPEN:
                chs = chooser.showOpenDialog(null);
                break;
            case FILE_SAVE:
                chs = chooser.showSaveDialog(null);
                break;
        }
        if (chs == JFileChooser.APPROVE_OPTION) {
            File file = chooser.getSelectedFile();
            switch (type) {
                case FILE_OPEN:
                    openFile(file);
                    break;
                case FILE_SAVE:
                    saveFile(file);
                    break;
            }
        }
    }

    private void openFile(File f) {
        area.setText("");
        try {
            //Bước 1: Tạo đối tượng luồng và liên kết nguồn dữ liệu
            FileReader fr = new FileReader(f);

            //Bước 2: Đọc dữ liệu
            BufferedReader br = new BufferedReader(fr);
            String line;
            while ((line = br.readLine()) != null) {
                area.append(line+"\n");
            }

            //Bước 3: Đóng luồng
            fr.close();
            br.close();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Lỗi đọc File", "Thông báo", 1);
        }
    }

    private void saveFile(File f) {
        String str = area.getText();
        try {
            //Bước 1: Tạo đối tượng luồng và liên kết nguồn dữ liệu           
            f.createNewFile();

            FileWriter fw = new FileWriter(f);

            //Bước 2: Ghi dữ liệu
            fw.write(str);

            //Bước 3: Đóng luồng
            fw.close();
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Lỗi ghi File", "Thông báo", 1);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == About) {
            JOptionPane.showMessageDialog(null, "Nguyễn Tuấn Vũ\nGmail: Tuanvubk96@gmail.com\nVervion: Demo 1.0", "About", 1);
        }

        if (e.getSource() == copy) {
            strCopy = area.getSelectedText();
        }
        if (e.getSource() == paste) {
            int pos = area.getCaretPosition();
            area.replaceSelection(strCopy);
        }

    }
    private String strCopy;
}

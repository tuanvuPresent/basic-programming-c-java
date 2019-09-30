/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author NguyenTuanVu
 */
public class Regex {

    //  ^           Là bắt đầu
    //  $           Là kết thúc  
    //  *           Là 0-vô cùng
    // {1}          Có 1 kí tự
    //  +           Xuất hiện 1 hoặc nhi�?u lần
    //  ?           Xuất hiện 0 hoặc 1 lần
    //  {X,Y}       Xuất hiện trong khoảng X tới Y lần.
    //  \\s         Có khoảng trắng
    //  [^0-9]      Ký tự không phải là số 
    //  [^abc]      Khi dấu ^ xuất hiện như là nhân vật đầu tiên trong dấu ngoặc vuông, nó phủ nhận mô hình
    //  XZ          Tìm X và theo sau là Z.
    //[abc][vz]     Thiết lập định nghĩa, có thể khớp với a hoặc b hoặc c theo sau là v hay z.
    //pattern gmail
    static String regex = "^[a-zA-Z]+[a-z0-9]*@{1}+[a-zA-Z]+mail.com$";//chu + 1 hoặc nhi�?u chữ,số+ @+ chữ+ mail.com
    //pattern phân số
    static String regexPS = "^[0-9]+[0-9]*/{1}+[0-9]+[0-9]*$";

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String str = "tuanvubk96@gmail.com";
        //cach 1
        Pattern pattern = Pattern.compile(regex);           //biên dịch mẫu
        Matcher matcher = pattern.matcher(str);
        if (matcher.find()) {
            System.out.println("" + true); 
        } else {
            System.out.println("" + false);
        }
        //cach 2
        if (str.matches(regex)) {
            System.out.println("" + true);
        } else {
            System.out.println("" + false);
        }
    }

}

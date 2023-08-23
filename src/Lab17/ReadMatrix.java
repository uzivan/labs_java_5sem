package Lab17;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReadMatrix {
    private int[][] matrix;
    private int[][] matrix_tr;

    int len = 0;
    int height = 0;

    public ReadMatrix() throws FileNotFoundException {
        List<Integer> matrix_list = new ArrayList<Integer>();
        File file = new File("/home/ivan/Рабочий стол/in");
        Scanner scan = new Scanner(file);
        while (scan.hasNextLine()) {
            len = len + 1;
            scan.nextLine();
        }
        scan.close();
        scan = new Scanner(file);
        while (scan.hasNext()) {
            matrix_list.add(scan.nextInt());
        }
        matrix = new int[len][matrix_list.size() / len];
        matrix_tr = new int[matrix_list.size() / len][len];
        for (int i = 0; i < matrix_list.size() / len; i++) {
            for (int j = 0; j < matrix_list.size(); j = j + matrix_list.size() / len) {
                matrix_tr[i][j / (matrix_list.size() / len)] = matrix_list.get(i + j);
            }
        }
        int count = 0;
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < matrix_list.size() / len; j++) {
                matrix[i][j] = matrix_list.get(count);
                count++;
            }
        }
        height = matrix_list.size()/len;
    }

    public void print_matrix() {
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < height; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println("");
        }
    }

    public void print_matrix_tr(){
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < len; j++) {
                System.out.print(matrix_tr[i][j] + " ");
            }
            System.out.println("");
        }
    }


}

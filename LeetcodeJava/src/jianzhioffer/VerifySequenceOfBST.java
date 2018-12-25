package jianzhioffer;

/**
 * @Description:
 * @Author: Renzi Meng
 * @Date: Created in 12:00 2018/12/24
 * @Copyright： 2018, Renzi Meng, All Rights Reserved.
 */

public class VerifySequenceOfBST {
    public boolean VerifySquenceOfBST(int [] sequence) {
        if(sequence.length == 0) {return false;}
        return VerifySequenceOfBST (sequence, 0, sequence.length - 1);
    }

    public boolean VerifySequenceOfBST(int [] sequence, int start, int end) {
        if (start >= end) return true;
        int root = sequence[end];

        int i, j;
        for(i = 0; i< end; i++) {
            if (sequence[i] > root) {break;}
        }

        for(j = i; j< end; j++) {
            if (sequence[j] < root) {return false;}
        }

        return VerifySequenceOfBST ( sequence, start, i - 1 ) && VerifySequenceOfBST ( sequence, i , end - 1 );
    }

}

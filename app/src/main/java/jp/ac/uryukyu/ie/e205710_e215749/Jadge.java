package jp.ac.uryukyu.ie.e205710_e215749;

/**
 * UserとPCが出した手で勝敗の判定
 */
public class Jadge {
    /**
     * 判定メソッド。
     * @param user ユーザー。
     * @param pc　対戦時の相手。
     * @return　勝ち負けあいこの文字を返す
     */
    public static String jugde(int user, int pc){
        String result ="";

        if((user == 0 && pc ==1)||(user == 1 && pc == 2)||(user == 2 && pc == 0)){
            result ="勝ち";
        }else if((user == 0 && pc == 0)||(user == 1 && pc == 1)||(user == 2 && pc == 2)){
            result ="あいこ";
        }else if((user == 0 && pc == 2)||(user == 1 && pc == 0)||(user == 2 && pc == 1)){
            result ="負け";
        }
        return result;
    }
}
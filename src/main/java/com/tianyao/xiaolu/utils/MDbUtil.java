package com.tianyao.xiaolu.utils;

import com.lidroid.xutils.DbUtils;

/**
 * Created by 陆维淋
 * on 2018/10/8
 */
public class MDbUtil {
    private static MDbUtil ourInstance;
    private DbUtils db;

    private MDbUtil() {

    }

    public static MDbUtil getInstance() {
        if (ourInstance == null) {
            synchronized (MDbUtil.class) {
                if (ourInstance == null) {
                    ourInstance = new MDbUtil();
                }
            }
        }
        return ourInstance;
    }

    public DbUtils getDb() {
        if (db == null) {
            throw new RuntimeException();
        }
        return db;
    }

    public void setDb(DbUtils db) {
        this.db = db;
    }


}

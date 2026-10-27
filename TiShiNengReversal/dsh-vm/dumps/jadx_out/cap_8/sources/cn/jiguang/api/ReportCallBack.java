package cn.jiguang.api;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public interface ReportCallBack {
    public static final int DELIVERED = 1;
    public static final int ERROR = -2;
    public static final int FAILED = -1;
    public static final int OK = 0;

    void onFinish(int r1);
}

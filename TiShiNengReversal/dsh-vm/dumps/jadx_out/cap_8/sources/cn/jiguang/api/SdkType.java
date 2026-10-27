package cn.jiguang.api;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public enum SdkType extends java.lang.Enum<cn.jiguang.api.SdkType> {
    private static final /* synthetic */ cn.jiguang.api.SdkType[] $VALUES = null;
    public static final cn.jiguang.api.SdkType JAD = null;
    public static final cn.jiguang.api.SdkType JANALYTICS = null;
    public static final cn.jiguang.api.SdkType JCORE = null;
    public static final cn.jiguang.api.SdkType JMESSAGE = null;
    public static final cn.jiguang.api.SdkType JMLINK = null;
    public static final cn.jiguang.api.SdkType JPUSH = null;
    public static final cn.jiguang.api.SdkType JSHARE = null;
    public static final cn.jiguang.api.SdkType JUNION = null;
    public static final cn.jiguang.api.SdkType JVERIFICATION = null;

    private static /* synthetic */ cn.jiguang.api.SdkType[] $values() {
            r0 = 9
            cn.jiguang.api.SdkType[] r0 = new cn.jiguang.api.SdkType[r0]
            cn.jiguang.api.SdkType r1 = cn.jiguang.api.SdkType.JCORE
            r2 = 0
            r0[r2] = r1
            cn.jiguang.api.SdkType r1 = cn.jiguang.api.SdkType.JPUSH
            r2 = 1
            r0[r2] = r1
            cn.jiguang.api.SdkType r1 = cn.jiguang.api.SdkType.JANALYTICS
            r2 = 2
            r0[r2] = r1
            cn.jiguang.api.SdkType r1 = cn.jiguang.api.SdkType.JSHARE
            r2 = 3
            r0[r2] = r1
            cn.jiguang.api.SdkType r1 = cn.jiguang.api.SdkType.JMESSAGE
            r2 = 4
            r0[r2] = r1
            cn.jiguang.api.SdkType r1 = cn.jiguang.api.SdkType.JAD
            r2 = 5
            r0[r2] = r1
            cn.jiguang.api.SdkType r1 = cn.jiguang.api.SdkType.JVERIFICATION
            r2 = 6
            r0[r2] = r1
            cn.jiguang.api.SdkType r1 = cn.jiguang.api.SdkType.JMLINK
            r2 = 7
            r0[r2] = r1
            cn.jiguang.api.SdkType r1 = cn.jiguang.api.SdkType.JUNION
            r2 = 8
            r0[r2] = r1
            return r0
    }

    static {
            cn.jiguang.api.SdkType r0 = new cn.jiguang.api.SdkType
            java.lang.String r1 = "JCORE"
            r2 = 0
            r0.<init>(r1, r2)
            cn.jiguang.api.SdkType.JCORE = r0
            cn.jiguang.api.SdkType r0 = new cn.jiguang.api.SdkType
            java.lang.String r1 = "JPUSH"
            r2 = 1
            r0.<init>(r1, r2)
            cn.jiguang.api.SdkType.JPUSH = r0
            cn.jiguang.api.SdkType r0 = new cn.jiguang.api.SdkType
            java.lang.String r1 = "JANALYTICS"
            r2 = 2
            r0.<init>(r1, r2)
            cn.jiguang.api.SdkType.JANALYTICS = r0
            cn.jiguang.api.SdkType r0 = new cn.jiguang.api.SdkType
            java.lang.String r1 = "JSHARE"
            r2 = 3
            r0.<init>(r1, r2)
            cn.jiguang.api.SdkType.JSHARE = r0
            cn.jiguang.api.SdkType r0 = new cn.jiguang.api.SdkType
            java.lang.String r1 = "JMESSAGE"
            r2 = 4
            r0.<init>(r1, r2)
            cn.jiguang.api.SdkType.JMESSAGE = r0
            cn.jiguang.api.SdkType r0 = new cn.jiguang.api.SdkType
            java.lang.String r1 = "JAD"
            r2 = 5
            r0.<init>(r1, r2)
            cn.jiguang.api.SdkType.JAD = r0
            cn.jiguang.api.SdkType r0 = new cn.jiguang.api.SdkType
            java.lang.String r1 = "JVERIFICATION"
            r2 = 6
            r0.<init>(r1, r2)
            cn.jiguang.api.SdkType.JVERIFICATION = r0
            cn.jiguang.api.SdkType r0 = new cn.jiguang.api.SdkType
            java.lang.String r1 = "JMLINK"
            r2 = 7
            r0.<init>(r1, r2)
            cn.jiguang.api.SdkType.JMLINK = r0
            cn.jiguang.api.SdkType r0 = new cn.jiguang.api.SdkType
            java.lang.String r1 = "JUNION"
            r2 = 8
            r0.<init>(r1, r2)
            cn.jiguang.api.SdkType.JUNION = r0
            cn.jiguang.api.SdkType[] r0 = $values()
            cn.jiguang.api.SdkType.$VALUES = r0
            return
    }

    SdkType(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static cn.jiguang.api.SdkType valueOf(java.lang.String r1) {
            java.lang.Class<cn.jiguang.api.SdkType> r0 = cn.jiguang.api.SdkType.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            cn.jiguang.api.SdkType r1 = (cn.jiguang.api.SdkType) r1
            return r1
    }

    public static cn.jiguang.api.SdkType[] values() {
            cn.jiguang.api.SdkType[] r0 = cn.jiguang.api.SdkType.$VALUES
            java.lang.Object r0 = r0.clone()
            cn.jiguang.api.SdkType[] r0 = (cn.jiguang.api.SdkType[]) r0
            return r0
    }
}

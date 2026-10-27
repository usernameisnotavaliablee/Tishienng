package cn.jpush.android.v;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class d {
    public d() {
            r1 = this;
            r1.<init>()
            return
    }

    public static void a(android.content.Context r3) {
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            java.lang.String r1 = "JPUSH"
            java.lang.String r2 = "clear_local_notify"
            cn.jpush.android.helper.JCoreHelper.runActionWithService(r3, r1, r2, r0)
            return
    }

    public static void a(android.content.Context r2, long r3) {
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            java.lang.String r1 = "local_notify_ID"
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            r0.putSerializable(r1, r3)
            java.lang.String r3 = "JPUSH"
            java.lang.String r4 = "rm_local_notify"
            cn.jpush.android.helper.JCoreHelper.runActionWithService(r2, r3, r4, r0)
            return
    }

    public static void a(android.content.Context r2, cn.jpush.android.data.JPushLocalNotification r3) {
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            java.lang.String r1 = "local_notify"
            r0.putSerializable(r1, r3)
            java.lang.String r3 = "JPUSH"
            java.lang.String r1 = "add_local_notify"
            cn.jpush.android.helper.JCoreHelper.runActionWithService(r2, r3, r1, r0)
            return
    }
}

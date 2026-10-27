package cn.jpush.android.api;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class CustomPushNotificationBuilder extends cn.jpush.android.api.BasicPushNotificationBuilder {
    public int layout;
    public int layoutContentId;
    public int layoutIconDrawable;
    public int layoutIconId;
    public int layoutTimeId;
    public int layoutTitleId;

    CustomPushNotificationBuilder(android.content.Context r1) {
            r0 = this;
            r0.<init>(r1)
            r1 = 0
            r0.layoutIconDrawable = r1
            return
    }

    public CustomPushNotificationBuilder(android.content.Context r1, int r2, int r3, int r4, int r5) {
            r0 = this;
            r0.<init>(r1)
            r1 = 0
            r0.layoutIconDrawable = r1
            r0.layout = r2
            r0.layoutIconId = r3
            r0.layoutTitleId = r4
            r0.layoutContentId = r5
            return
    }

    public CustomPushNotificationBuilder(android.content.Context r3, int r4, int r5, int r6, int r7, int r8) {
            r2 = this;
            java.lang.String r0 = "CustomPushNotificationB"
            r2.<init>(r3)
            r1 = 0
            r2.layoutIconDrawable = r1
            r2.layout = r4
            r2.layoutTitleId = r6
            r2.layoutContentId = r7
            r2.layoutTimeId = r8
            r2.layoutIconId = r5
            android.content.pm.PackageManager r4 = r3.getPackageManager()     // Catch: java.lang.Throwable -> L2b
            java.lang.String r3 = r3.getPackageName()     // Catch: java.lang.Throwable -> L2b
            android.content.pm.ApplicationInfo r3 = r4.getApplicationInfo(r3, r1)     // Catch: java.lang.Throwable -> L2b
            if (r3 != 0) goto L26
            java.lang.String r3 = "JPush get NULL appInfo."
            cn.jpush.android.helper.Logger.ee(r0, r3)     // Catch: java.lang.Throwable -> L2b
            return
        L26:
            int r3 = r3.icon     // Catch: java.lang.Throwable -> L2b
            r2.layoutIconDrawable = r3     // Catch: java.lang.Throwable -> L2b
            return
        L2b:
            java.lang.String r3 = "[statusBarDrawable] JPush get NULL appInfo."
            cn.jpush.android.helper.Logger.ww(r0, r3)
            return
    }

    @Override // cn.jpush.android.api.BasicPushNotificationBuilder
    java.lang.String a() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = super.a()
            r0.append(r1)
            java.lang.String r1 = "_____"
            r0.append(r1)
            int r2 = r3.layout
            r0.append(r2)
            r0.append(r1)
            int r2 = r3.layoutIconId
            r0.append(r2)
            r0.append(r1)
            int r2 = r3.layoutTitleId
            r0.append(r2)
            r0.append(r1)
            int r2 = r3.layoutContentId
            r0.append(r2)
            r0.append(r1)
            int r2 = r3.layoutIconDrawable
            r0.append(r2)
            r0.append(r1)
            int r1 = r3.layoutTimeId
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // cn.jpush.android.api.BasicPushNotificationBuilder
    void a(java.lang.String[] r3) {
            r2 = this;
            super.a(r3)
            r0 = 5
            r0 = r3[r0]
            int r0 = java.lang.Integer.parseInt(r0)
            r2.layout = r0
            r0 = 6
            r0 = r3[r0]
            int r0 = java.lang.Integer.parseInt(r0)
            r2.layoutIconId = r0
            r0 = 7
            r0 = r3[r0]
            int r0 = java.lang.Integer.parseInt(r0)
            r2.layoutTitleId = r0
            r0 = 8
            r0 = r3[r0]
            int r0 = java.lang.Integer.parseInt(r0)
            r2.layoutContentId = r0
            r0 = 9
            r0 = r3[r0]
            int r0 = java.lang.Integer.parseInt(r0)
            r2.layoutIconDrawable = r0
            int r0 = r3.length
            r1 = 11
            if (r0 != r1) goto L41
            r0 = 10
            r3 = r3[r0]
            int r3 = java.lang.Integer.parseInt(r3)
            r2.layoutTimeId = r3
        L41:
            return
    }

    @Override // cn.jpush.android.api.DefaultPushNotificationBuilder
    android.widget.RemoteViews buildContentView(java.lang.String r4, java.lang.String r5) {
            r3 = this;
            android.widget.RemoteViews r0 = new android.widget.RemoteViews
            android.content.Context r1 = r3.a
            java.lang.String r1 = r1.getPackageName()
            int r2 = r3.layout
            r0.<init>(r1, r2)
            int r1 = r3.layoutTitleId
            r0.setTextViewText(r1, r5)
            int r5 = r3.layoutIconId
            int r1 = r3.layoutIconDrawable
            r0.setImageViewResource(r5, r1)
            int r5 = r3.layoutContentId
            r0.setTextViewText(r5, r4)
            int r4 = r3.layoutTimeId
            if (r4 == 0) goto L2b
            java.lang.String r5 = "setTime"
            long r1 = java.lang.System.currentTimeMillis()
            r0.setLong(r4, r5, r1)
        L2b:
            return r0
    }

    @Override // cn.jpush.android.api.BasicPushNotificationBuilder, cn.jpush.android.api.DefaultPushNotificationBuilder
    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "custom_____"
            r0.append(r1)
            java.lang.String r1 = r2.a()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}

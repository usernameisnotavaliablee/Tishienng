package xyz.adscope.common.v2.dev.info;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class SettingCheckCompilation {
    private static final java.lang.String HUAWEI = "HUAWEI";
    private static final java.lang.String HYPER = "XIAOMI";
    private static final java.lang.String MAGIC = "HONOR";
    private static final java.lang.String OPPO = "OPPO";
    private static final java.lang.String VIVO = "VIVO";

    public SettingCheckCompilation() {
            r0 = this;
            r0.<init>()
            return
    }

    private static int checkHuaweiIntentPrompt(android.content.Context r6) {
            android.content.ContentResolver r6 = r6.getContentResolver()     // Catch: java.lang.Throwable -> L43
            java.lang.String r0 = "adb_enabled"
            r1 = -1
            int r6 = android.provider.Settings.Global.getInt(r6, r0, r1)     // Catch: java.lang.Throwable -> L43
            r0 = 0
            r1 = 1
            if (r6 != r1) goto L10
            return r0
        L10:
            java.lang.String r6 = "com.huawei.android.os.SystemPropertiesEx"
            java.lang.Class r6 = java.lang.Class.forName(r6)     // Catch: java.lang.Throwable -> L43
            java.lang.String r2 = "getBoolean"
            r3 = 2
            java.lang.Class[] r4 = new java.lang.Class[r3]     // Catch: java.lang.Throwable -> L43
            java.lang.Class<java.lang.String> r5 = java.lang.String.class
            r4[r0] = r5     // Catch: java.lang.Throwable -> L43
            java.lang.Class r5 = java.lang.Boolean.TYPE     // Catch: java.lang.Throwable -> L43
            r4[r1] = r5     // Catch: java.lang.Throwable -> L43
            java.lang.reflect.Method r6 = r6.getDeclaredMethod(r2, r4)     // Catch: java.lang.Throwable -> L43
            r6.setAccessible(r1)     // Catch: java.lang.Throwable -> L43
            java.lang.Object[] r2 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L43
            java.lang.String r3 = "hw_sc.appswitch_interceptor"
            r2[r0] = r3     // Catch: java.lang.Throwable -> L43
            java.lang.Boolean r3 = java.lang.Boolean.FALSE     // Catch: java.lang.Throwable -> L43
            r2[r1] = r3     // Catch: java.lang.Throwable -> L43
            r3 = 0
            java.lang.Object r6 = r6.invoke(r3, r2)     // Catch: java.lang.Throwable -> L43
            java.lang.Boolean r6 = (java.lang.Boolean) r6     // Catch: java.lang.Throwable -> L43
            boolean r6 = r6.booleanValue()     // Catch: java.lang.Throwable -> L43
            if (r6 == 0) goto L42
            return r1
        L42:
            return r0
        L43:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "HUAWEI: Can't check intent prompt status."
            r6.<init>(r0)
            throw r6
    }

    private static int checkHyperIntentPrompt(android.content.Context r9) {
            java.lang.String r0 = "appops"
            java.lang.Object r0 = r9.getSystemService(r0)     // Catch: java.lang.Throwable -> L59
            android.app.AppOpsManager r0 = (android.app.AppOpsManager) r0     // Catch: java.lang.Throwable -> L59
            java.lang.Class<android.app.AppOpsManager> r1 = android.app.AppOpsManager.class
            java.lang.String r2 = "checkOpNoThrow"
            r3 = 3
            java.lang.Class[] r4 = new java.lang.Class[r3]     // Catch: java.lang.Throwable -> L59
            java.lang.Class r5 = java.lang.Integer.TYPE     // Catch: java.lang.Throwable -> L59
            r6 = 0
            r4[r6] = r5     // Catch: java.lang.Throwable -> L59
            r7 = 1
            r4[r7] = r5     // Catch: java.lang.Throwable -> L59
            java.lang.Class<java.lang.String> r5 = java.lang.String.class
            r8 = 2
            r4[r8] = r5     // Catch: java.lang.Throwable -> L59
            java.lang.reflect.Method r1 = r1.getDeclaredMethod(r2, r4)     // Catch: java.lang.Throwable -> L59
            android.content.pm.PackageManager r2 = r9.getPackageManager()     // Catch: java.lang.Throwable -> L59
            java.lang.String r4 = r9.getPackageName()     // Catch: java.lang.Throwable -> L59
            android.content.pm.ApplicationInfo r2 = r2.getApplicationInfo(r4, r6)     // Catch: java.lang.Throwable -> L59
            if (r2 == 0) goto L57
            r4 = 10049(0x2741, float:1.4082E-41)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.Throwable -> L59
            int r2 = r2.uid     // Catch: java.lang.Throwable -> L59
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Throwable -> L59
            java.lang.String r9 = r9.getPackageName()     // Catch: java.lang.Throwable -> L59
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L59
            r3[r6] = r4     // Catch: java.lang.Throwable -> L59
            r3[r7] = r2     // Catch: java.lang.Throwable -> L59
            r3[r8] = r9     // Catch: java.lang.Throwable -> L59
            java.lang.Object r9 = r1.invoke(r0, r3)     // Catch: java.lang.Throwable -> L59
            java.lang.String r9 = r9.toString()     // Catch: java.lang.Throwable -> L59
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch: java.lang.Throwable -> L59
            int r9 = r9.intValue()     // Catch: java.lang.Throwable -> L59
            return r9
        L57:
            r9 = -1
            return r9
        L59:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Hyper: Can't check intent prompt status."
            r9.<init>(r0)
            throw r9
    }

    public static int checkIntentPrompt(android.content.Context r3) {
            r0 = -1
            java.lang.String r1 = android.os.Build.BRAND     // Catch: java.lang.Throwable -> L50
            java.lang.String r1 = r1.toUpperCase()     // Catch: java.lang.Throwable -> L50
            int r2 = r1.hashCode()     // Catch: java.lang.Throwable -> L50
            switch(r2) {
                case -1706170181: goto L43;
                case 2432928: goto L36;
                case 2634924: goto L29;
                case 68924490: goto L1c;
                case 2141820391: goto Lf;
                default: goto Le;
            }     // Catch: java.lang.Throwable -> L50
        Le:
            goto L50
        Lf:
            java.lang.String r2 = "HUAWEI"
            boolean r1 = r1.equals(r2)     // Catch: java.lang.Throwable -> L50
            if (r1 == 0) goto L50
            int r3 = checkHuaweiIntentPrompt(r3)     // Catch: java.lang.Throwable -> L50
            return r3
        L1c:
            java.lang.String r2 = "HONOR"
            boolean r1 = r1.equals(r2)     // Catch: java.lang.Throwable -> L50
            if (r1 == 0) goto L50
            int r3 = checkMagicIntentPrompt(r3)     // Catch: java.lang.Throwable -> L50
            return r3
        L29:
            java.lang.String r2 = "VIVO"
            boolean r1 = r1.equals(r2)     // Catch: java.lang.Throwable -> L50
            if (r1 == 0) goto L50
            int r3 = checkVivoIntentPrompt(r3)     // Catch: java.lang.Throwable -> L50
            return r3
        L36:
            java.lang.String r2 = "OPPO"
            boolean r1 = r1.equals(r2)     // Catch: java.lang.Throwable -> L50
            if (r1 == 0) goto L50
            int r3 = checkOppoIntentPrompt(r3)     // Catch: java.lang.Throwable -> L50
            return r3
        L43:
            java.lang.String r2 = "XIAOMI"
            boolean r1 = r1.equals(r2)     // Catch: java.lang.Throwable -> L50
            if (r1 == 0) goto L50
            int r3 = checkHyperIntentPrompt(r3)     // Catch: java.lang.Throwable -> L50
            return r3
        L50:
            return r0
    }

    private static int checkMagicIntentPrompt(android.content.Context r2) {
            android.content.ContentResolver r2 = r2.getContentResolver()     // Catch: java.lang.Throwable -> Lc
            java.lang.String r0 = "application_auto_jump_switch"
            r1 = -1
            int r2 = android.provider.Settings.System.getInt(r2, r0, r1)     // Catch: java.lang.Throwable -> Lc
            return r2
        Lc:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Magic: Can't check intent prompt status."
            r2.<init>(r0)
            throw r2
    }

    private static int checkOppoIntentPrompt(android.content.Context r2) {
            android.content.ContentResolver r2 = r2.getContentResolver()     // Catch: java.lang.Throwable -> Lc
            java.lang.String r0 = "app_start_confirm_rus_enable"
            r1 = -1
            int r2 = android.provider.Settings.Global.getInt(r2, r0, r1)     // Catch: java.lang.Throwable -> Lc
            return r2
        Lc:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "OPPO: Can't check intent prompt status."
            r2.<init>(r0)
            throw r2
    }

    private static int checkVivoIntentPrompt(android.content.Context r2) {
            android.content.Intent r0 = new android.content.Intent     // Catch: java.lang.Throwable -> L1c
            java.lang.String r1 = "com.vivo.appfilter.ACTION_APP_JUMP_PROMPT"
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L1c
            java.lang.String r1 = "com.vivo.appfilter"
            r0.setPackage(r1)     // Catch: java.lang.Throwable -> L1c
            android.content.pm.PackageManager r2 = r2.getPackageManager()     // Catch: java.lang.Throwable -> L1c
            r1 = 0
            java.util.List r2 = r2.queryIntentActivities(r0, r1)     // Catch: java.lang.Throwable -> L1c
            boolean r2 = r2.isEmpty()     // Catch: java.lang.Throwable -> L1c
            r2 = r2 ^ 1
            return r2
        L1c:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "ViVO: Can't check intent prompt status."
            r2.<init>(r0)
            throw r2
    }
}

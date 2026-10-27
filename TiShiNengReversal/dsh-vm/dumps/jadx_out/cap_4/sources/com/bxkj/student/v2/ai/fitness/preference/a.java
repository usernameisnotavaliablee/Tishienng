package com.bxkj.student.v2.ai.fitness.preference;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class a {
    private static final int a = 1;
    private static final int b = 2;

    private a() {
            r0 = this;
            r0.<init>()
            return
    }

    @androidx.annotation.Nullable
    public static com.bxkj.student.v2.ai.fitness.camera.c.C0141c a(android.content.Context r3, int r4) {
            r0 = 1
            if (r4 == 0) goto L7
            if (r4 != r0) goto L6
            goto L7
        L6:
            r0 = 0
        L7:
            com.google.common.base.Preconditions.checkArgument(r0)
            if (r4 != 0) goto L1b
            r4 = 2131952271(0x7f13028f, float:1.954098E38)
            java.lang.String r4 = r3.getString(r4)
            r0 = 2131952270(0x7f13028e, float:1.9540978E38)
            java.lang.String r0 = r3.getString(r0)
            goto L29
        L1b:
            r4 = 2131952263(0x7f130287, float:1.9540964E38)
            java.lang.String r4 = r3.getString(r4)
            r0 = 2131952262(0x7f130286, float:1.9540962E38)
            java.lang.String r0 = r3.getString(r0)
        L29:
            r1 = 0
            android.content.SharedPreferences r3 = android.preference.PreferenceManager.getDefaultSharedPreferences(r3)     // Catch: java.lang.Exception -> L44
            com.bxkj.student.v2.ai.fitness.camera.c$c r2 = new com.bxkj.student.v2.ai.fitness.camera.c$c     // Catch: java.lang.Exception -> L44
            java.lang.String r4 = r3.getString(r4, r1)     // Catch: java.lang.Exception -> L44
            com.google.android.gms.common.images.Size r4 = com.google.android.gms.common.images.Size.parseSize(r4)     // Catch: java.lang.Exception -> L44
            java.lang.String r3 = r3.getString(r0, r1)     // Catch: java.lang.Exception -> L44
            com.google.android.gms.common.images.Size r3 = com.google.android.gms.common.images.Size.parseSize(r3)     // Catch: java.lang.Exception -> L44
            r2.<init>(r4, r3)     // Catch: java.lang.Exception -> L44
            return r2
        L44:
            return r1
    }

    private static int b(android.content.Context r1, @androidx.annotation.StringRes int r2, int r3) {
            android.content.SharedPreferences r0 = android.preference.PreferenceManager.getDefaultSharedPreferences(r1)
            java.lang.String r1 = r1.getString(r2)
            java.lang.String r2 = java.lang.String.valueOf(r3)
            java.lang.String r1 = r0.getString(r1, r2)
            int r1 = java.lang.Integer.parseInt(r1)
            return r1
    }

    public static com.google.mlkit.vision.pose.PoseDetectorOptionsBase c(android.content.Context r2) {
            com.google.mlkit.vision.pose.defaults.PoseDetectorOptions$Builder r0 = new com.google.mlkit.vision.pose.defaults.PoseDetectorOptions$Builder
            r0.<init>()
            r1 = 1
            com.google.mlkit.vision.pose.defaults.PoseDetectorOptions$Builder r0 = r0.setDetectorMode(r1)
            boolean r2 = e(r2)
            if (r2 == 0) goto L17
            r2 = 0
            int[] r2 = new int[r2]
            r1 = 2
            r0.setPreferredHardwareConfigs(r1, r2)
        L17:
            com.google.mlkit.vision.pose.defaults.PoseDetectorOptions r2 = r0.build()
            return r2
    }

    public static boolean d(android.content.Context r2) {
            android.content.SharedPreferences r0 = android.preference.PreferenceManager.getDefaultSharedPreferences(r2)
            r1 = 2131952261(0x7f130285, float:1.954096E38)
            java.lang.String r2 = r2.getString(r1)
            r1 = 0
            boolean r2 = r0.getBoolean(r2, r1)
            return r2
    }

    public static boolean e(android.content.Context r2) {
            android.content.SharedPreferences r0 = android.preference.PreferenceManager.getDefaultSharedPreferences(r2)
            r1 = 2131952267(0x7f13028b, float:1.9540972E38)
            java.lang.String r2 = r2.getString(r1)
            r1 = 1
            boolean r2 = r0.getBoolean(r2, r1)
            return r2
    }

    static void f(android.content.Context r1, @androidx.annotation.StringRes int r2, @androidx.annotation.Nullable java.lang.String r3) {
            android.content.SharedPreferences r0 = android.preference.PreferenceManager.getDefaultSharedPreferences(r1)
            android.content.SharedPreferences$Editor r0 = r0.edit()
            java.lang.String r1 = r1.getString(r2)
            android.content.SharedPreferences$Editor r1 = r0.putString(r1, r3)
            r1.apply()
            return
    }

    public static boolean g(android.content.Context r1) {
            android.preference.PreferenceManager.getDefaultSharedPreferences(r1)
            r0 = 2131952264(0x7f130288, float:1.9540966E38)
            r1.getString(r0)
            r1 = 1
            return r1
    }

    public static boolean h(android.content.Context r2) {
            android.content.SharedPreferences r0 = android.preference.PreferenceManager.getDefaultSharedPreferences(r2)
            r1 = 2131952268(0x7f13028c, float:1.9540974E38)
            java.lang.String r2 = r2.getString(r1)
            r1 = 1
            boolean r2 = r0.getBoolean(r2, r1)
            return r2
    }

    public static boolean i(android.content.Context r2) {
            android.content.SharedPreferences r0 = android.preference.PreferenceManager.getDefaultSharedPreferences(r2)
            r1 = 2131952269(0x7f13028d, float:1.9540976E38)
            java.lang.String r2 = r2.getString(r1)
            r1 = 1
            boolean r2 = r0.getBoolean(r2, r1)
            return r2
    }

    public static boolean j(android.content.Context r1) {
            android.preference.PreferenceManager.getDefaultSharedPreferences(r1)
            r0 = 2131952266(0x7f13028a, float:1.954097E38)
            r1.getString(r0)
            r1 = 0
            return r1
    }
}

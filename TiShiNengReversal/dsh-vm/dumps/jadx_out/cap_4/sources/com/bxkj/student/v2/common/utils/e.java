package com.bxkj.student.v2.common.utils;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nDebugUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DebugUtils.kt\ncom/bxkj/student/v2/common/utils/DebugUtils\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,97:1\n1#2:98\n*E\n"})
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public final class e {

    @org.jetbrains.annotations.NotNull
    public static final com.bxkj.student.v2.common.utils.e a = null;

    static {
            com.bxkj.student.v2.common.utils.e r0 = new com.bxkj.student.v2.common.utils.e
            r0.<init>()
            com.bxkj.student.v2.common.utils.e.a = r0
            return
    }

    private e() {
            r0 = this;
            r0.<init>()
            return
    }

    public final void a(@org.jetbrains.annotations.NotNull androidx.fragment.app.FragmentActivity r2, @org.jetbrains.annotations.NotNull java.lang.String r3) {
            r1 = this;
            java.lang.String r0 = "context"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r2 = "databaseName"
            kotlin.jvm.internal.g0.p(r3, r2)
            return
    }

    public final void b(@org.jetbrains.annotations.NotNull android.content.Context r5, @org.jetbrains.annotations.NotNull java.lang.String r6) {
            r4 = this;
            java.lang.String r0 = "context"
            kotlin.jvm.internal.g0.p(r5, r0)
            java.lang.String r0 = "preferencesName"
            kotlin.jvm.internal.g0.p(r6, r0)
            java.lang.String r5 = r5.getPackageName()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "/data/data/"
            r0.append(r1)
            r0.append(r5)
            java.lang.String r5 = "/shared_prefs/"
            r0.append(r5)
            r0.append(r6)
            java.lang.String r5 = ".xml"
            r0.append(r5)
            java.lang.String r0 = r0.toString()
            java.io.File r1 = android.os.Environment.getExternalStorageDirectory()
            java.lang.String r1 = r1.getPath()
            java.lang.String r2 = java.io.File.separator
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r1)
            r3.append(r2)
            r3.append(r6)
            r3.append(r5)
            java.lang.String r5 = r3.toString()
            java.io.File r6 = new java.io.File     // Catch: java.lang.Exception -> L74
            r6.<init>(r0)     // Catch: java.lang.Exception -> L74
            java.io.File r0 = new java.io.File     // Catch: java.lang.Exception -> L74
            r0.<init>(r5)     // Catch: java.lang.Exception -> L74
            boolean r5 = r6.exists()     // Catch: java.lang.Exception -> L74
            if (r5 == 0) goto L85
            java.io.FileInputStream r5 = new java.io.FileInputStream     // Catch: java.lang.Exception -> L74
            r5.<init>(r6)     // Catch: java.lang.Exception -> L74
            java.io.FileOutputStream r6 = new java.io.FileOutputStream     // Catch: java.lang.Exception -> L74
            r6.<init>(r0)     // Catch: java.lang.Exception -> L74
            r0 = 1024(0x400, float:1.435E-42)
            byte[] r0 = new byte[r0]     // Catch: java.lang.Exception -> L74
        L69:
            int r1 = r5.read(r0)     // Catch: java.lang.Exception -> L74
            if (r1 <= 0) goto L76
            r2 = 0
            r6.write(r0, r2, r1)     // Catch: java.lang.Exception -> L74
            goto L69
        L74:
            r5 = move-exception
            goto L8d
        L76:
            r5.close()     // Catch: java.lang.Exception -> L74
            r6.flush()     // Catch: java.lang.Exception -> L74
            r6.close()     // Catch: java.lang.Exception -> L74
            java.io.PrintStream r5 = java.lang.System.out     // Catch: java.lang.Exception -> L74
            r5.getClass()     // Catch: java.lang.Exception -> L74
            return
        L85:
            java.io.IOException r5 = new java.io.IOException     // Catch: java.lang.Exception -> L74
            java.lang.String r6 = "源 SharedPreferences 文件不存在"
            r5.<init>(r6)     // Catch: java.lang.Exception -> L74
            throw r5     // Catch: java.lang.Exception -> L74
        L8d:
            r5.getMessage()
            java.io.PrintStream r5 = java.lang.System.out
            r5.getClass()
            return
    }

    public final void c(@org.jetbrains.annotations.NotNull androidx.fragment.app.FragmentActivity r2) {
            r1 = this;
            java.lang.String r0 = "context"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "TSNStudent.db"
            r1.a(r2, r0)
            java.lang.String r0 = "share_date"
            r1.b(r2, r0)
            return
    }
}

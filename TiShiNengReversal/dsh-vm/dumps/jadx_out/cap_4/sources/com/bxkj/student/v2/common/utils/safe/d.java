package com.bxkj.student.v2.common.utils.safe;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public final class d {

    @org.jetbrains.annotations.NotNull
    public static final com.bxkj.student.v2.common.utils.safe.d a = null;

    static {
            com.bxkj.student.v2.common.utils.safe.d r0 = new com.bxkj.student.v2.common.utils.safe.d
            r0.<init>()
            com.bxkj.student.v2.common.utils.safe.d.a = r0
            return
    }

    private d() {
            r0 = this;
            r0.<init>()
            return
    }

    private final boolean b() {
            r17 = this;
            java.lang.String r0 = android.os.Build.FINGERPRINT
            java.lang.String r1 = "FINGERPRINT"
            kotlin.jvm.internal.g0.o(r0, r1)
            java.lang.String r2 = "generic"
            r3 = 0
            r4 = 2
            r5 = 0
            boolean r6 = kotlin.text.u.H2(r0, r2, r3, r4, r5)
            if (r6 != 0) goto L1d9
            kotlin.jvm.internal.g0.o(r0, r1)
            java.util.Locale r6 = java.util.Locale.getDefault()
            java.lang.String r7 = "getDefault(...)"
            kotlin.jvm.internal.g0.o(r6, r7)
            java.lang.String r6 = r0.toLowerCase(r6)
            java.lang.String r8 = "toLowerCase(...)"
            kotlin.jvm.internal.g0.o(r6, r8)
            java.lang.String r9 = "vbox"
            boolean r6 = kotlin.text.u.l3(r6, r9, r3, r4, r5)
            if (r6 != 0) goto L1d9
            kotlin.jvm.internal.g0.o(r0, r1)
            java.util.Locale r1 = java.util.Locale.getDefault()
            kotlin.jvm.internal.g0.o(r1, r7)
            java.lang.String r0 = r0.toLowerCase(r1)
            kotlin.jvm.internal.g0.o(r0, r8)
            java.lang.String r1 = "test-keys"
            boolean r0 = kotlin.text.u.l3(r0, r1, r3, r4, r5)
            if (r0 != 0) goto L1d9
            java.lang.String r0 = android.os.Build.MODEL
            java.lang.String r1 = "MODEL"
            kotlin.jvm.internal.g0.o(r0, r1)
            java.lang.String r6 = "Emulator"
            boolean r6 = kotlin.text.u.l3(r0, r6, r3, r4, r5)
            if (r6 != 0) goto L1d9
            kotlin.jvm.internal.g0.o(r0, r1)
            java.lang.String r1 = "Android SDK built for x86"
            boolean r0 = kotlin.text.u.l3(r0, r1, r3, r4, r5)
            if (r0 != 0) goto L1d9
            java.lang.String r0 = android.os.Build.MANUFACTURER
            java.lang.String r1 = "MANUFACTURER"
            kotlin.jvm.internal.g0.o(r0, r1)
            java.lang.String r1 = "Genymotion"
            boolean r0 = kotlin.text.u.l3(r0, r1, r3, r4, r5)
            if (r0 != 0) goto L1d9
            java.lang.String r0 = android.os.Build.BRAND
            java.lang.String r1 = "BRAND"
            kotlin.jvm.internal.g0.o(r0, r1)
            boolean r6 = kotlin.text.u.H2(r0, r2, r3, r4, r5)
            java.lang.String r9 = "DEVICE"
            if (r6 == 0) goto L8b
            java.lang.String r6 = android.os.Build.DEVICE
            kotlin.jvm.internal.g0.o(r6, r9)
            boolean r6 = kotlin.text.u.H2(r6, r2, r3, r4, r5)
            if (r6 != 0) goto L1d9
        L8b:
            java.lang.String r6 = android.os.Build.PRODUCT
            java.lang.String r10 = "google_sdk"
            boolean r11 = kotlin.jvm.internal.g0.g(r10, r6)
            if (r11 != 0) goto L1d9
            java.lang.String r11 = android.os.Build.HARDWARE
            java.lang.String r12 = "HARDWARE"
            kotlin.jvm.internal.g0.o(r11, r12)
            java.lang.String r13 = "goldfish"
            boolean r13 = kotlin.text.u.l3(r11, r13, r3, r4, r5)
            if (r13 != 0) goto L1d9
            kotlin.jvm.internal.g0.o(r11, r12)
            java.lang.String r13 = "ranchu"
            boolean r13 = kotlin.text.u.l3(r11, r13, r3, r4, r5)
            if (r13 != 0) goto L1d9
            kotlin.jvm.internal.g0.o(r11, r12)
            java.lang.String r13 = "vbox86"
            boolean r13 = kotlin.text.u.l3(r11, r13, r3, r4, r5)
            if (r13 != 0) goto L1d9
            java.lang.String r13 = "PRODUCT"
            kotlin.jvm.internal.g0.o(r6, r13)
            java.lang.String r14 = "sdk"
            boolean r14 = kotlin.text.u.l3(r6, r14, r3, r4, r5)
            if (r14 != 0) goto L1d9
            kotlin.jvm.internal.g0.o(r6, r13)
            boolean r14 = kotlin.text.u.l3(r6, r10, r3, r4, r5)
            if (r14 != 0) goto L1d9
            kotlin.jvm.internal.g0.o(r6, r13)
            java.lang.String r14 = "sdk_x86"
            boolean r14 = kotlin.text.u.l3(r6, r14, r3, r4, r5)
            if (r14 != 0) goto L1d9
            kotlin.jvm.internal.g0.o(r6, r13)
            java.lang.String r14 = "vbox86p"
            boolean r14 = kotlin.text.u.l3(r6, r14, r3, r4, r5)
            if (r14 != 0) goto L1d9
            java.lang.String r14 = android.os.Build.BOARD
            java.lang.String r15 = "BOARD"
            kotlin.jvm.internal.g0.o(r14, r15)
            java.util.Locale r15 = java.util.Locale.getDefault()
            kotlin.jvm.internal.g0.o(r15, r7)
            java.lang.String r14 = r14.toLowerCase(r15)
            kotlin.jvm.internal.g0.o(r14, r8)
            java.lang.String r15 = "nox"
            boolean r14 = kotlin.text.u.l3(r14, r15, r3, r4, r5)
            if (r14 != 0) goto L1d9
            java.lang.String r14 = android.os.Build.BOOTLOADER
            java.lang.String r3 = "BOOTLOADER"
            kotlin.jvm.internal.g0.o(r14, r3)
            java.util.Locale r3 = java.util.Locale.getDefault()
            kotlin.jvm.internal.g0.o(r3, r7)
            java.lang.String r3 = r14.toLowerCase(r3)
            kotlin.jvm.internal.g0.o(r3, r8)
            r14 = 0
            boolean r3 = kotlin.text.u.l3(r3, r15, r14, r4, r5)
            if (r3 != 0) goto L1d9
            kotlin.jvm.internal.g0.o(r11, r12)
            java.util.Locale r3 = java.util.Locale.getDefault()
            kotlin.jvm.internal.g0.o(r3, r7)
            java.lang.String r3 = r11.toLowerCase(r3)
            kotlin.jvm.internal.g0.o(r3, r8)
            boolean r3 = kotlin.text.u.l3(r3, r15, r14, r4, r5)
            if (r3 != 0) goto L1d9
            kotlin.jvm.internal.g0.o(r6, r13)
            java.util.Locale r3 = java.util.Locale.getDefault()
            kotlin.jvm.internal.g0.o(r3, r7)
            java.lang.String r3 = r6.toLowerCase(r3)
            kotlin.jvm.internal.g0.o(r3, r8)
            boolean r3 = kotlin.text.u.l3(r3, r15, r14, r4, r5)
            if (r3 != 0) goto L1d9
            java.lang.String r3 = android.os.Build.SERIAL
            java.lang.String r11 = "SERIAL"
            kotlin.jvm.internal.g0.o(r3, r11)
            java.util.Locale r11 = java.util.Locale.getDefault()
            kotlin.jvm.internal.g0.o(r11, r7)
            java.lang.String r3 = r3.toLowerCase(r11)
            kotlin.jvm.internal.g0.o(r3, r8)
            boolean r3 = kotlin.text.u.l3(r3, r15, r14, r4, r5)
            if (r3 != 0) goto L1d9
            kotlin.jvm.internal.g0.o(r0, r1)
            boolean r0 = kotlin.text.u.H2(r0, r2, r14, r4, r5)
            if (r0 == 0) goto L17c
            java.lang.String r0 = android.os.Build.DEVICE
            kotlin.jvm.internal.g0.o(r0, r9)
            boolean r0 = kotlin.text.u.H2(r0, r2, r14, r4, r5)
            if (r0 != 0) goto L1d9
        L17c:
            boolean r0 = kotlin.jvm.internal.g0.g(r10, r6)
            if (r0 != 0) goto L1d9
            com.bxkj.student.App$a r0 = com.bxkj.student.App.d
            com.bxkj.student.App r0 = r0.a()
            android.content.ContentResolver r0 = r0.getContentResolver()
            java.lang.String r1 = "android_id"
            java.lang.String r0 = android.provider.Settings.Secure.getString(r0, r1)
            if (r0 == 0) goto L1d9
            java.io.File r0 = new java.io.File
            java.lang.String r1 = "/init.goldfish.rc"
            r0.<init>(r1)
            boolean r0 = r0.exists()
            if (r0 != 0) goto L1d9
            java.io.File r0 = new java.io.File
            java.lang.String r1 = "/sys/qemu_trace"
            r0.<init>(r1)
            boolean r0 = r0.exists()
            if (r0 != 0) goto L1d9
            java.io.File r0 = new java.io.File
            java.lang.String r1 = "/system/bin/qemu_props"
            r0.<init>(r1)
            boolean r0 = r0.exists()
            if (r0 != 0) goto L1d9
            java.io.File r0 = new java.io.File
            java.lang.String r1 = "/dev/socket/qemud"
            r0.<init>(r1)
            boolean r0 = r0.exists()
            if (r0 != 0) goto L1d9
            java.io.File r0 = new java.io.File
            java.lang.String r1 = "/dev/qemu_pipe"
            r0.<init>(r1)
            boolean r0 = r0.exists()
            if (r0 == 0) goto L1d6
            goto L1d9
        L1d6:
            r16 = 0
            return r16
        L1d9:
            r0 = 1
            return r0
    }

    public final boolean a() {
            r1 = this;
            com.bxkj.student.App$a r0 = com.bxkj.student.App.d
            com.bxkj.student.App r0 = r0.a()
            boolean r0 = com.snail.antifake.jni.EmulatorDetectUtil.b(r0)
            if (r0 != 0) goto L15
            boolean r0 = r1.b()
            if (r0 == 0) goto L13
            goto L15
        L13:
            r0 = 0
            return r0
        L15:
            r0 = 1
            return r0
    }
}

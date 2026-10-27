package com.umeng.socialize.c.b;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class d {
    public static final int a = 0;
    public static final int b = 1;
    public static final int c = 2;
    public static final int d = 3;
    public static final int e = 4;
    public static final int f = 5;
    public static final int g = 6;
    public static final int h = 7;
    public static final int i = 8;
    public static final int j = 9;
    public static final int k = 10;
    public static final int l = 11;
    public static final java.lang.String[] m = null;

    static {
            java.lang.String r10 = "psd"
            java.lang.String r11 = "swf"
            java.lang.String r0 = "jpeg"
            java.lang.String r1 = "gif"
            java.lang.String r2 = "png"
            java.lang.String r3 = "bmp"
            java.lang.String r4 = "pcx"
            java.lang.String r5 = "iff"
            java.lang.String r6 = "ras"
            java.lang.String r7 = "pbm"
            java.lang.String r8 = "pgm"
            java.lang.String r9 = "ppm"
            java.lang.String[] r0 = new java.lang.String[]{r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11}
            com.umeng.socialize.c.b.d.m = r0
            return
    }

    public d() {
            r0 = this;
            r0.<init>()
            return
    }

    public static java.lang.String a(byte[] r11) {
            java.lang.String r0 = ""
            r1 = 0
            java.io.ByteArrayInputStream r2 = new java.io.ByteArrayInputStream     // Catch: java.lang.Throwable -> Lcb java.lang.Exception -> Lcd
            r2.<init>(r11)     // Catch: java.lang.Throwable -> Lcb java.lang.Exception -> Lcd
            int r11 = r2.read()     // Catch: java.lang.Throwable -> L28 java.lang.Exception -> L2c
            int r1 = r2.read()     // Catch: java.lang.Throwable -> L28 java.lang.Exception -> L2c
            r3 = 71
            r4 = 1
            if (r11 != r3) goto L30
            r3 = 73
            if (r1 != r3) goto L30
            java.lang.String[] r11 = com.umeng.socialize.c.b.d.m     // Catch: java.lang.Throwable -> L28 java.lang.Exception -> L2c
            r11 = r11[r4]     // Catch: java.lang.Throwable -> L28 java.lang.Exception -> L2c
        L1d:
            r2.close()     // Catch: java.io.IOException -> L21
            return r11
        L21:
            r0 = move-exception
            java.lang.String r1 = com.umeng.socialize.utils.UmengText.IMAGE.CLOSE
            com.umeng.socialize.utils.SLog.error(r1, r0)
            return r11
        L28:
            r11 = move-exception
            r1 = r2
            goto Le0
        L2c:
            r11 = move-exception
            r1 = r2
            goto Lce
        L30:
            r3 = 137(0x89, float:1.92E-43)
            r5 = 80
            if (r11 != r3) goto L3e
            if (r1 != r5) goto L3e
            java.lang.String[] r11 = com.umeng.socialize.c.b.d.m     // Catch: java.lang.Throwable -> L28 java.lang.Exception -> L2c
            r1 = 2
            r11 = r11[r1]     // Catch: java.lang.Throwable -> L28 java.lang.Exception -> L2c
            goto L1d
        L3e:
            r3 = 255(0xff, float:3.57E-43)
            if (r11 != r3) goto L4c
            r3 = 216(0xd8, float:3.03E-43)
            if (r1 != r3) goto L4c
            java.lang.String[] r11 = com.umeng.socialize.c.b.d.m     // Catch: java.lang.Throwable -> L28 java.lang.Exception -> L2c
            r1 = 0
            r11 = r11[r1]     // Catch: java.lang.Throwable -> L28 java.lang.Exception -> L2c
            goto L1d
        L4c:
            r3 = 3
            r6 = 66
            if (r11 != r6) goto L5a
            r7 = 77
            if (r1 != r7) goto L5a
            java.lang.String[] r11 = com.umeng.socialize.c.b.d.m     // Catch: java.lang.Throwable -> L28 java.lang.Exception -> L2c
            r11 = r11[r3]     // Catch: java.lang.Throwable -> L28 java.lang.Exception -> L2c
            goto L1d
        L5a:
            r7 = 10
            r8 = 6
            if (r11 != r7) goto L67
            if (r1 >= r8) goto L67
            java.lang.String[] r11 = com.umeng.socialize.c.b.d.m     // Catch: java.lang.Throwable -> L28 java.lang.Exception -> L2c
            r1 = 4
            r11 = r11[r1]     // Catch: java.lang.Throwable -> L28 java.lang.Exception -> L2c
            goto L1d
        L67:
            r9 = 70
            if (r11 != r9) goto L75
            r10 = 79
            if (r1 != r10) goto L75
            java.lang.String[] r11 = com.umeng.socialize.c.b.d.m     // Catch: java.lang.Throwable -> L28 java.lang.Exception -> L2c
            r1 = 5
            r11 = r11[r1]     // Catch: java.lang.Throwable -> L28 java.lang.Exception -> L2c
            goto L1d
        L75:
            r10 = 89
            if (r11 != r10) goto L82
            r10 = 166(0xa6, float:2.33E-43)
            if (r1 != r10) goto L82
            java.lang.String[] r11 = com.umeng.socialize.c.b.d.m     // Catch: java.lang.Throwable -> L28 java.lang.Exception -> L2c
            r11 = r11[r8]     // Catch: java.lang.Throwable -> L28 java.lang.Exception -> L2c
            goto L1d
        L82:
            if (r11 != r5) goto Lb1
            r5 = 49
            if (r1 < r5) goto Lb1
            r10 = 54
            if (r1 > r10) goto Lb1
            int r11 = r1 + (-48)
            if (r11 < r4) goto La6
            if (r11 <= r8) goto L93
            goto La6
        L93:
            r11 = 8
            r4 = 9
            r6 = 7
            int[] r11 = new int[]{r6, r11, r4}     // Catch: java.lang.Throwable -> L28 java.lang.Exception -> L2c
            int r1 = r1 - r5
            int r1 = r1 % r3
            r11 = r11[r1]     // Catch: java.lang.Throwable -> L28 java.lang.Exception -> L2c
            java.lang.String[] r1 = com.umeng.socialize.c.b.d.m     // Catch: java.lang.Throwable -> L28 java.lang.Exception -> L2c
            r11 = r1[r11]     // Catch: java.lang.Throwable -> L28 java.lang.Exception -> L2c
            goto L1d
        La6:
            r2.close()     // Catch: java.io.IOException -> Laa
            return r0
        Laa:
            r11 = move-exception
            java.lang.String r1 = com.umeng.socialize.utils.UmengText.IMAGE.CLOSE
            com.umeng.socialize.utils.SLog.error(r1, r11)
            return r0
        Lb1:
            r3 = 56
            if (r11 != r3) goto Lbd
            if (r1 != r6) goto Lbd
            java.lang.String[] r11 = com.umeng.socialize.c.b.d.m     // Catch: java.lang.Throwable -> L28 java.lang.Exception -> L2c
            r11 = r11[r7]     // Catch: java.lang.Throwable -> L28 java.lang.Exception -> L2c
            goto L1d
        Lbd:
            if (r11 != r9) goto La6
            r11 = 87
            if (r1 != r11) goto La6
            java.lang.String[] r11 = com.umeng.socialize.c.b.d.m     // Catch: java.lang.Throwable -> L28 java.lang.Exception -> L2c
            r1 = 11
            r11 = r11[r1]     // Catch: java.lang.Throwable -> L28 java.lang.Exception -> L2c
            goto L1d
        Lcb:
            r11 = move-exception
            goto Le0
        Lcd:
            r11 = move-exception
        Lce:
            java.lang.String r2 = com.umeng.socialize.utils.UmengText.IMAGE.CHECK_FORMAT_ERROR     // Catch: java.lang.Throwable -> Lcb
            com.umeng.socialize.utils.SLog.error(r2, r11)     // Catch: java.lang.Throwable -> Lcb
            if (r1 == 0) goto Ldf
            r1.close()     // Catch: java.io.IOException -> Ld9
            goto Ldf
        Ld9:
            r11 = move-exception
            java.lang.String r1 = com.umeng.socialize.utils.UmengText.IMAGE.CLOSE
            com.umeng.socialize.utils.SLog.error(r1, r11)
        Ldf:
            return r0
        Le0:
            if (r1 == 0) goto Lec
            r1.close()     // Catch: java.io.IOException -> Le6
            goto Lec
        Le6:
            r0 = move-exception
            java.lang.String r1 = com.umeng.socialize.utils.UmengText.IMAGE.CLOSE
            com.umeng.socialize.utils.SLog.error(r1, r0)
        Lec:
            throw r11
    }
}

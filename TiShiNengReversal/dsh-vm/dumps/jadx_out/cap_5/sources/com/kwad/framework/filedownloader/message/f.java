package com.kwad.framework.filedownloader.message;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class f {
    public f() {
            r0 = this;
            r0.<init>()
            return
    }

    public static com.kwad.framework.filedownloader.message.MessageSnapshot a(byte r7, com.kwad.framework.filedownloader.d.c r8, com.kwad.framework.filedownloader.download.d.a r9) {
            int r1 = r8.getId()
            r0 = -4
            r2 = 1
            r3 = 0
            if (r7 == r0) goto L155
            r0 = -3
            if (r7 == r0) goto L13a
            r0 = -1
            if (r7 == r0) goto L117
            if (r7 == r2) goto Lf3
            r0 = 2
            if (r7 == r0) goto Lb8
            r4 = 3
            if (r7 == r4) goto L9d
            r4 = 5
            if (r7 == r4) goto L72
            r4 = 6
            if (r7 == r4) goto L6c
            java.lang.Byte r4 = java.lang.Byte.valueOf(r7)
            java.lang.Object[] r5 = new java.lang.Object[r0]
            r5[r3] = r8
            r5[r2] = r4
            java.lang.String r4 = "it can't takes a snapshot for the task(%s) when its status is %d,"
            java.lang.String r5 = com.kwad.framework.filedownloader.f.f.c(r4, r5)
            java.lang.Byte r7 = java.lang.Byte.valueOf(r7)
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r0[r3] = r8
            r0[r2] = r7
            java.lang.Class<com.kwad.framework.filedownloader.message.f> r7 = com.kwad.framework.filedownloader.message.f.class
            com.kwad.framework.filedownloader.f.d.d(r7, r4, r0)
            java.lang.Exception r7 = r9.getException()
            if (r7 == 0) goto L4c
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.Exception r9 = r9.getException()
            r7.<init>(r5, r9)
            goto L51
        L4c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            r7.<init>(r5)
        L51:
            boolean r9 = r8.wP()
            if (r9 == 0) goto L61
            com.kwad.framework.filedownloader.message.d$d r9 = new com.kwad.framework.filedownloader.message.d$d
            long r2 = r8.yZ()
            r9.<init>(r1, r2, r7)
            return r9
        L61:
            com.kwad.framework.filedownloader.message.h$d r9 = new com.kwad.framework.filedownloader.message.h$d
            long r2 = r8.yZ()
            int r8 = (int) r2
            r9.<init>(r1, r8, r7)
            return r9
        L6c:
            com.kwad.framework.filedownloader.message.MessageSnapshot$b r7 = new com.kwad.framework.filedownloader.message.MessageSnapshot$b
            r7.<init>(r1)
            return r7
        L72:
            boolean r7 = r8.wP()
            if (r7 == 0) goto L8a
            com.kwad.framework.filedownloader.message.d$h r0 = new com.kwad.framework.filedownloader.message.d$h
            long r2 = r8.yZ()
            java.lang.Exception r4 = r9.getException()
            int r5 = r9.wN()
            r0.<init>(r1, r2, r4, r5)
            return r0
        L8a:
            com.kwad.framework.filedownloader.message.h$h r7 = new com.kwad.framework.filedownloader.message.h$h
            long r2 = r8.yZ()
            int r8 = (int) r2
            java.lang.Exception r0 = r9.getException()
            int r9 = r9.wN()
            r7.<init>(r1, r8, r0, r9)
            return r7
        L9d:
            boolean r7 = r8.wP()
            if (r7 == 0) goto Lad
            com.kwad.framework.filedownloader.message.d$g r7 = new com.kwad.framework.filedownloader.message.d$g
            long r8 = r8.yZ()
            r7.<init>(r1, r8)
            return r7
        Lad:
            com.kwad.framework.filedownloader.message.h$g r7 = new com.kwad.framework.filedownloader.message.h$g
            long r8 = r8.yZ()
            int r9 = (int) r8
            r7.<init>(r1, r9)
            return r7
        Lb8:
            boolean r7 = r8.wF()
            if (r7 == 0) goto Lc4
            java.lang.String r7 = r8.getFilename()
        Lc2:
            r5 = r7
            goto Lc6
        Lc4:
            r7 = 0
            goto Lc2
        Lc6:
            boolean r7 = r8.wP()
            if (r7 == 0) goto Ldf
            com.kwad.framework.filedownloader.message.d$c r0 = new com.kwad.framework.filedownloader.message.d$c
            boolean r2 = r9.yE()
            long r3 = r8.getTotal()
            r6 = r5
            java.lang.String r5 = r8.za()
            r0.<init>(r1, r2, r3, r5, r6)
            return r0
        Ldf:
            r6 = r5
            com.kwad.framework.filedownloader.message.h$c r0 = new com.kwad.framework.filedownloader.message.h$c
            boolean r2 = r9.yE()
            long r3 = r8.getTotal()
            int r3 = (int) r3
            java.lang.String r4 = r8.za()
            r0.<init>(r1, r2, r3, r4, r5)
            return r0
        Lf3:
            boolean r7 = r8.wP()
            if (r7 == 0) goto L107
            com.kwad.framework.filedownloader.message.d$f r0 = new com.kwad.framework.filedownloader.message.d$f
            long r2 = r8.yZ()
            long r4 = r8.getTotal()
            r0.<init>(r1, r2, r4)
            return r0
        L107:
            com.kwad.framework.filedownloader.message.h$f r7 = new com.kwad.framework.filedownloader.message.h$f
            long r2 = r8.yZ()
            int r9 = (int) r2
            long r2 = r8.getTotal()
            int r8 = (int) r2
            r7.<init>(r1, r9, r8)
            return r7
        L117:
            boolean r7 = r8.wP()
            if (r7 == 0) goto L12b
            com.kwad.framework.filedownloader.message.d$d r7 = new com.kwad.framework.filedownloader.message.d$d
            long r2 = r8.yZ()
            java.lang.Exception r8 = r9.getException()
            r7.<init>(r1, r2, r8)
            return r7
        L12b:
            com.kwad.framework.filedownloader.message.h$d r7 = new com.kwad.framework.filedownloader.message.h$d
            long r2 = r8.yZ()
            int r8 = (int) r2
            java.lang.Exception r9 = r9.getException()
            r7.<init>(r1, r8, r9)
            return r7
        L13a:
            boolean r7 = r8.wP()
            if (r7 == 0) goto L14a
            com.kwad.framework.filedownloader.message.d$b r7 = new com.kwad.framework.filedownloader.message.d$b
            long r8 = r8.getTotal()
            r7.<init>(r1, r3, r8)
            return r7
        L14a:
            com.kwad.framework.filedownloader.message.h$b r7 = new com.kwad.framework.filedownloader.message.h$b
            long r8 = r8.getTotal()
            int r9 = (int) r8
            r7.<init>(r1, r3, r9)
            return r7
        L155:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.Integer r8 = java.lang.Integer.valueOf(r1)
            java.lang.Object[] r9 = new java.lang.Object[r2]
            r9[r3] = r8
            java.lang.String r8 = "please use #catchWarn instead %d"
            java.lang.String r8 = com.kwad.framework.filedownloader.f.f.c(r8, r9)
            r7.<init>(r8)
            throw r7
    }

    public static com.kwad.framework.filedownloader.message.MessageSnapshot a(int r6, long r7, long r9, boolean r11) {
            r0 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r2 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r2 <= 0) goto L1e
            if (r11 == 0) goto L13
            r1 = r6
            com.kwad.framework.filedownloader.message.d$i r6 = new com.kwad.framework.filedownloader.message.d$i
            r10 = r9
            r8 = r7
            r7 = r1
            r6.<init>(r7, r8, r10)
            return r6
        L13:
            r1 = r6
            r10 = r9
            r8 = r7
            com.kwad.framework.filedownloader.message.d$j r0 = new com.kwad.framework.filedownloader.message.d$j
            r2 = r8
            r4 = r10
            r0.<init>(r1, r2, r4)
            return r0
        L1e:
            r1 = r6
            r4 = r9
            r8 = r7
            if (r11 == 0) goto L2b
            com.kwad.framework.filedownloader.message.h$i r6 = new com.kwad.framework.filedownloader.message.h$i
            int r7 = (int) r8
            int r8 = (int) r4
            r6.<init>(r1, r7, r8)
            return r6
        L2b:
            com.kwad.framework.filedownloader.message.h$j r6 = new com.kwad.framework.filedownloader.message.h$j
            int r7 = (int) r8
            int r8 = (int) r4
            r6.<init>(r1, r7, r8)
            return r6
    }

    public static com.kwad.framework.filedownloader.message.MessageSnapshot a(int r3, long r4, java.lang.Throwable r6) {
            r0 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 <= 0) goto Ld
            com.kwad.framework.filedownloader.message.d$d r0 = new com.kwad.framework.filedownloader.message.d$d
            r0.<init>(r3, r4, r6)
            return r0
        Ld:
            com.kwad.framework.filedownloader.message.h$d r0 = new com.kwad.framework.filedownloader.message.h$d
            int r5 = (int) r4
            r0.<init>(r3, r5, r6)
            return r0
    }

    public static com.kwad.framework.filedownloader.message.MessageSnapshot a(int r5, java.io.File r6, boolean r7) {
            long r0 = r6.length()
            r2 = 2147483647(0x7fffffff, double:1.060997895E-314)
            r6 = 1
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto L1a
            if (r7 == 0) goto L14
            com.kwad.framework.filedownloader.message.d$a r7 = new com.kwad.framework.filedownloader.message.d$a
            r7.<init>(r5, r6, r0)
            return r7
        L14:
            com.kwad.framework.filedownloader.message.d$b r7 = new com.kwad.framework.filedownloader.message.d$b
            r7.<init>(r5, r6, r0)
            return r7
        L1a:
            if (r7 == 0) goto L23
            com.kwad.framework.filedownloader.message.h$a r7 = new com.kwad.framework.filedownloader.message.h$a
            int r1 = (int) r0
            r7.<init>(r5, r6, r1)
            return r7
        L23:
            com.kwad.framework.filedownloader.message.h$b r7 = new com.kwad.framework.filedownloader.message.h$b
            int r1 = (int) r0
            r7.<init>(r5, r6, r1)
            return r7
    }

    public static com.kwad.framework.filedownloader.message.MessageSnapshot e(com.kwad.framework.filedownloader.a r7) {
            boolean r0 = r7.wP()
            if (r0 == 0) goto L18
            com.kwad.framework.filedownloader.message.d$e r1 = new com.kwad.framework.filedownloader.message.d$e
            int r2 = r7.getId()
            long r3 = r7.wH()
            long r5 = r7.wI()
            r1.<init>(r2, r3, r5)
            return r1
        L18:
            com.kwad.framework.filedownloader.message.h$e r0 = new com.kwad.framework.filedownloader.message.h$e
            int r1 = r7.getId()
            int r2 = r7.getSmallFileSoFarBytes()
            int r7 = r7.getSmallFileTotalBytes()
            r0.<init>(r1, r2, r7)
            return r0
    }

    public static com.kwad.framework.filedownloader.message.MessageSnapshot t(com.kwad.framework.filedownloader.message.MessageSnapshot r4) {
            byte r0 = r4.wJ()
            r1 = -3
            if (r0 != r1) goto Ld
            com.kwad.framework.filedownloader.message.a$a r0 = new com.kwad.framework.filedownloader.message.a$a
            r0.<init>(r4)
            return r0
        Ld:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            int r1 = r4.getId()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            byte r4 = r4.wJ()
            java.lang.Byte r4 = java.lang.Byte.valueOf(r4)
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r1
            r1 = 1
            r2[r1] = r4
            java.lang.String r4 = "take block completed snapshot, must has already be completed. %d %d"
            java.lang.String r4 = com.kwad.framework.filedownloader.f.f.c(r4, r2)
            r0.<init>(r4)
            throw r0
    }
}

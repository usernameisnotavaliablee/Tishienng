package com.huawei.hms.scankit.p;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class c4 {
    static final java.lang.String[] b = null;
    static final int[][] c = null;
    private static final int[][] d = null;
    static final int[][] e = null;
    private final byte[] a;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class a<State> implements java.util.Comparator<com.huawei.hms.scankit.p.b7> {
        a() {
                r0 = this;
                r0.<init>()
                return
        }

        public int a(com.huawei.hms.scankit.p.b7 r1, com.huawei.hms.scankit.p.b7 r2) {
                r0 = this;
                int r1 = r1.b()
                int r2 = r2.b()
                int r1 = r1 - r2
                return r1
        }

        @Override // java.util.Comparator
        public /* bridge */ /* synthetic */ int compare(com.huawei.hms.scankit.p.b7 r1, com.huawei.hms.scankit.p.b7 r2) {
                r0 = this;
                com.huawei.hms.scankit.p.b7 r1 = (com.huawei.hms.scankit.p.b7) r1
                com.huawei.hms.scankit.p.b7 r2 = (com.huawei.hms.scankit.p.b7) r2
                int r1 = r0.a(r1, r2)
                return r1
        }
    }

    static {
            java.lang.String r0 = "MIXED"
            java.lang.String r1 = "PUNCT"
            java.lang.String r2 = "UPPER"
            java.lang.String r3 = "LOWER"
            java.lang.String r4 = "DIGIT"
            java.lang.String[] r0 = new java.lang.String[]{r2, r3, r4, r0, r1}
            com.huawei.hms.scankit.p.c4.b = r0
            r0 = 5
            int[][] r1 = new int[r0][]
            r2 = 0
            r3 = 327708(0x5001c, float:4.59217E-40)
            r4 = 327710(0x5001e, float:4.5922E-40)
            r5 = 327709(0x5001d, float:4.59218E-40)
            r6 = 656318(0xa03be, float:9.19697E-40)
            int[] r7 = new int[]{r2, r3, r4, r5, r6}
            r1[r2] = r7
            r7 = 590318(0x901ee, float:8.27212E-40)
            int[] r7 = new int[]{r7, r2, r4, r5, r6}
            r8 = 1
            r1[r8] = r7
            r7 = 590301(0x901dd, float:8.27188E-40)
            r9 = 932798(0xe3bbe, float:1.307128E-39)
            r10 = 262158(0x4000e, float:3.67362E-40)
            r11 = 590300(0x901dc, float:8.27186E-40)
            int[] r7 = new int[]{r10, r11, r2, r7, r9}
            r9 = 2
            r1[r9] = r7
            int[] r3 = new int[]{r5, r3, r6, r2, r4}
            r4 = 3
            r1[r4] = r3
            r3 = 656382(0xa03fe, float:9.19787E-40)
            r5 = 656381(0xa03fd, float:9.19786E-40)
            r6 = 327711(0x5001f, float:4.59221E-40)
            r7 = 656380(0xa03fc, float:9.19784E-40)
            int[] r3 = new int[]{r6, r7, r3, r5, r2}
            r5 = 4
            r1[r5] = r3
            com.huawei.hms.scankit.p.c4.c = r1
            int[] r1 = new int[r9]
            r3 = 256(0x100, float:3.59E-43)
            r1[r8] = r3
            r1[r2] = r0
            java.lang.Class r0 = java.lang.Integer.TYPE
            java.lang.Object r1 = java.lang.reflect.Array.newInstance(r0, r1)
            int[][] r1 = (int[][]) r1
            com.huawei.hms.scankit.p.c4.d = r1
            r1 = r1[r2]
            r3 = 32
            r1[r3] = r8
            r1 = 65
        L79:
            r6 = 90
            if (r1 > r6) goto L88
            int[][] r6 = com.huawei.hms.scankit.p.c4.d
            r6 = r6[r2]
            int r7 = r1 + (-63)
            r6[r1] = r7
            int r1 = r1 + 1
            goto L79
        L88:
            int[][] r1 = com.huawei.hms.scankit.p.c4.d
            r1 = r1[r8]
            r1[r3] = r8
            r1 = 97
        L90:
            r6 = 122(0x7a, float:1.71E-43)
            if (r1 > r6) goto L9f
            int[][] r6 = com.huawei.hms.scankit.p.c4.d
            r6 = r6[r8]
            int r7 = r1 + (-95)
            r6[r1] = r7
            int r1 = r1 + 1
            goto L90
        L9f:
            int[][] r1 = com.huawei.hms.scankit.p.c4.d
            r1 = r1[r9]
            r1[r3] = r8
            r1 = 48
        La7:
            r3 = 57
            if (r1 > r3) goto Lb6
            int[][] r3 = com.huawei.hms.scankit.p.c4.d
            r3 = r3[r9]
            int r6 = r1 + (-46)
            r3[r1] = r6
            int r1 = r1 + 1
            goto La7
        Lb6:
            int[][] r1 = com.huawei.hms.scankit.p.c4.d
            r1 = r1[r9]
            r3 = 44
            r6 = 12
            r1[r3] = r6
            r3 = 46
            r6 = 13
            r1[r3] = r6
            r1 = 28
            int[] r3 = new int[r1]
            r3 = {x0180: FILL_ARRAY_DATA , data: [0, 32, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 27, 28, 29, 30, 31, 64, 92, 94, 95, 96, 124, 126, 127} // fill-array
            r6 = 0
        Lce:
            if (r6 >= r1) goto Ldb
            int[][] r7 = com.huawei.hms.scankit.p.c4.d
            r7 = r7[r4]
            r10 = r3[r6]
            r7[r10] = r6
            int r6 = r6 + 1
            goto Lce
        Ldb:
            r3 = 31
            int[] r6 = new int[r3]
            r6 = {x01bc: FILL_ARRAY_DATA , data: [0, 13, 0, 0, 0, 0, 33, 39, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 58, 59, 60, 61, 62, 63, 91, 93, 123, 125} // fill-array
            r7 = 0
        Le3:
            if (r7 >= r3) goto Lf2
            r10 = r6[r7]
            if (r10 <= 0) goto Lef
            int[][] r11 = com.huawei.hms.scankit.p.c4.d
            r11 = r11[r5]
            r11[r10] = r7
        Lef:
            int r7 = r7 + 1
            goto Le3
        Lf2:
            int[] r3 = new int[r9]
            r6 = 6
            r3[r8] = r6
            r3[r2] = r6
            java.lang.Object r0 = java.lang.reflect.Array.newInstance(r0, r3)
            int[][] r0 = (int[][]) r0
            com.huawei.hms.scankit.p.c4.e = r0
            int r3 = r0.length
            r6 = 0
        L103:
            if (r6 >= r3) goto L10e
            r7 = r0[r6]
            r10 = -1
            java.util.Arrays.fill(r7, r10)
            int r6 = r6 + 1
            goto L103
        L10e:
            int[][] r0 = com.huawei.hms.scankit.p.c4.e
            boolean r3 = com.huawei.hms.scankit.p.w7.a(r0, r2)
            if (r3 == 0) goto L122
            r3 = r0[r2]
            boolean r3 = com.huawei.hms.scankit.p.w7.a(r3, r5)
            if (r3 == 0) goto L122
            r3 = r0[r2]
            r3[r5] = r2
        L122:
            boolean r3 = com.huawei.hms.scankit.p.w7.a(r0, r8)
            if (r3 == 0) goto L134
            r3 = r0[r8]
            boolean r3 = com.huawei.hms.scankit.p.w7.a(r3, r5)
            if (r3 == 0) goto L134
            r3 = r0[r8]
            r3[r5] = r2
        L134:
            boolean r3 = com.huawei.hms.scankit.p.w7.a(r0, r8)
            if (r3 == 0) goto L146
            r3 = r0[r8]
            boolean r3 = com.huawei.hms.scankit.p.w7.a(r3, r2)
            if (r3 == 0) goto L146
            r3 = r0[r8]
            r3[r2] = r1
        L146:
            boolean r1 = com.huawei.hms.scankit.p.w7.a(r0, r4)
            if (r1 == 0) goto L158
            r1 = r0[r4]
            boolean r1 = com.huawei.hms.scankit.p.w7.a(r1, r5)
            if (r1 == 0) goto L158
            r1 = r0[r4]
            r1[r5] = r2
        L158:
            boolean r1 = com.huawei.hms.scankit.p.w7.a(r0, r9)
            if (r1 == 0) goto L16a
            r1 = r0[r9]
            boolean r1 = com.huawei.hms.scankit.p.w7.a(r1, r5)
            if (r1 == 0) goto L16a
            r1 = r0[r9]
            r1[r5] = r2
        L16a:
            boolean r1 = com.huawei.hms.scankit.p.w7.a(r0, r9)
            if (r1 == 0) goto L17e
            r1 = r0[r9]
            boolean r1 = com.huawei.hms.scankit.p.w7.a(r1, r2)
            if (r1 == 0) goto L17e
            r0 = r0[r9]
            r1 = 15
            r0[r2] = r1
        L17e:
            return
    }

    public c4(byte[] r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    private static java.util.Collection<com.huawei.hms.scankit.p.b7> a(java.lang.Iterable<com.huawei.hms.scankit.p.b7> r5) {
            java.util.LinkedList r0 = new java.util.LinkedList
            r0.<init>()
            java.util.Iterator r5 = r5.iterator()
        L9:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L3a
            java.lang.Object r1 = r5.next()
            com.huawei.hms.scankit.p.b7 r1 = (com.huawei.hms.scankit.p.b7) r1
            java.util.Iterator r2 = r0.iterator()
        L19:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L36
            java.lang.Object r3 = r2.next()
            com.huawei.hms.scankit.p.b7 r3 = (com.huawei.hms.scankit.p.b7) r3
            boolean r4 = r3.a(r1)
            if (r4 == 0) goto L2c
            goto L9
        L2c:
            boolean r3 = r1.a(r3)
            if (r3 == 0) goto L19
            r2.remove()
            goto L19
        L36:
            r0.add(r1)
            goto L9
        L3a:
            return r0
    }

    private java.util.Collection<com.huawei.hms.scankit.p.b7> a(java.lang.Iterable<com.huawei.hms.scankit.p.b7> r3, int r4) {
            r2 = this;
            java.util.LinkedList r0 = new java.util.LinkedList
            r0.<init>()
            java.util.Iterator r3 = r3.iterator()
        L9:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L19
            java.lang.Object r1 = r3.next()
            com.huawei.hms.scankit.p.b7 r1 = (com.huawei.hms.scankit.p.b7) r1
            r2.a(r1, r4, r0)
            goto L9
        L19:
            java.util.Collection r3 = a(r0)
            return r3
    }

    private static java.util.Collection<com.huawei.hms.scankit.p.b7> a(java.lang.Iterable<com.huawei.hms.scankit.p.b7> r2, int r3, int r4) {
            java.util.LinkedList r0 = new java.util.LinkedList
            r0.<init>()
            java.util.Iterator r2 = r2.iterator()
        L9:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L19
            java.lang.Object r1 = r2.next()
            com.huawei.hms.scankit.p.b7 r1 = (com.huawei.hms.scankit.p.b7) r1
            a(r1, r3, r4, r0)
            goto L9
        L19:
            java.util.Collection r2 = a(r0)
            return r2
    }

    private static void a(com.huawei.hms.scankit.p.b7 r4, int r5, int r6, java.util.Collection<com.huawei.hms.scankit.p.b7> r7) {
            com.huawei.hms.scankit.p.b7 r0 = r4.b(r5)
            r1 = 4
            com.huawei.hms.scankit.p.b7 r2 = r0.a(r1, r6)
            r7.add(r2)
            int r2 = r4.c()
            if (r2 == r1) goto L19
            com.huawei.hms.scankit.p.b7 r2 = r0.b(r1, r6)
            r7.add(r2)
        L19:
            r2 = 3
            r3 = 1
            if (r6 == r2) goto L1f
            if (r6 != r1) goto L2d
        L1f:
            int r6 = 16 - r6
            r1 = 2
            com.huawei.hms.scankit.p.b7 r6 = r0.a(r1, r6)
            com.huawei.hms.scankit.p.b7 r6 = r6.a(r1, r3)
            r7.add(r6)
        L2d:
            int r6 = r4.a()
            if (r6 <= 0) goto L3f
            com.huawei.hms.scankit.p.b7 r4 = r4.a(r5)
            int r5 = r5 + r3
            com.huawei.hms.scankit.p.b7 r4 = r4.a(r5)
            r7.add(r4)
        L3f:
            return
    }

    private void a(com.huawei.hms.scankit.p.b7 r9, int r10, java.util.Collection<com.huawei.hms.scankit.p.b7> r11) {
            r8 = this;
            byte[] r0 = r8.a
            boolean r0 = com.huawei.hms.scankit.p.w7.a(r0, r10)
            if (r0 == 0) goto Lb1
            byte[] r0 = r8.a
            r0 = r0[r10]
            r0 = r0 & 255(0xff, float:3.57E-43)
            char r0 = (char) r0
            int[][] r1 = com.huawei.hms.scankit.p.c4.d
            int r2 = r9.c()
            boolean r2 = com.huawei.hms.scankit.p.w7.a(r1, r2)
            r3 = 0
            if (r2 == 0) goto L34
            int r2 = r9.c()
            r2 = r1[r2]
            boolean r2 = com.huawei.hms.scankit.p.w7.a(r2, r0)
            if (r2 == 0) goto L34
            int r2 = r9.c()
            r1 = r1[r2]
            r1 = r1[r0]
            if (r1 <= 0) goto L34
            r1 = 1
            goto L35
        L34:
            r1 = 0
        L35:
            r2 = 0
            r4 = 0
        L37:
            r5 = 4
            if (r4 > r5) goto L82
            int[][] r5 = com.huawei.hms.scankit.p.c4.d
            boolean r6 = com.huawei.hms.scankit.p.w7.a(r5, r4)
            if (r6 == 0) goto L4f
            r6 = r5[r4]
            boolean r6 = com.huawei.hms.scankit.p.w7.a(r6, r0)
            if (r6 == 0) goto L4f
            r5 = r5[r4]
            r5 = r5[r0]
            goto L50
        L4f:
            r5 = 0
        L50:
            if (r5 <= 0) goto L7f
            if (r2 != 0) goto L58
            com.huawei.hms.scankit.p.b7 r2 = r9.b(r10)
        L58:
            if (r1 == 0) goto L63
            int r6 = r9.c()
            if (r4 == r6) goto L63
            r6 = 2
            if (r4 != r6) goto L6a
        L63:
            com.huawei.hms.scankit.p.b7 r6 = r2.a(r4, r5)
            r11.add(r6)
        L6a:
            if (r1 != 0) goto L7f
            int[][] r6 = com.huawei.hms.scankit.p.c4.e
            int r7 = r9.c()
            r6 = r6[r7]
            r6 = r6[r4]
            if (r6 < 0) goto L7f
            com.huawei.hms.scankit.p.b7 r5 = r2.b(r4, r5)
            r11.add(r5)
        L7f:
            int r4 = r4 + 1
            goto L37
        L82:
            int[][] r1 = com.huawei.hms.scankit.p.c4.d
            int r2 = r9.c()
            boolean r2 = com.huawei.hms.scankit.p.w7.a(r1, r2)
            if (r2 == 0) goto Lb1
            int r2 = r9.c()
            r2 = r1[r2]
            boolean r2 = com.huawei.hms.scankit.p.w7.a(r2, r0)
            if (r2 == 0) goto Lb1
            int r2 = r9.a()
            if (r2 > 0) goto Laa
            int r2 = r9.c()
            r1 = r1[r2]
            r0 = r1[r0]
            if (r0 != 0) goto Lb1
        Laa:
            com.huawei.hms.scankit.p.b7 r9 = r9.a(r10)
            r11.add(r9)
        Lb1:
            return
    }

    public com.huawei.hms.scankit.p.r a() {
            r8 = this;
            com.huawei.hms.scankit.p.b7 r0 = com.huawei.hms.scankit.p.b7.e
            java.util.List r0 = java.util.Collections.singletonList(r0)
            r1 = 0
            r2 = 0
        L8:
            byte[] r3 = r8.a
            int r4 = r3.length
            if (r2 >= r4) goto L4d
            int r4 = r2 + 1
            int r5 = r3.length
            if (r4 >= r5) goto L15
            r5 = r3[r4]
            goto L16
        L15:
            r5 = 0
        L16:
            r3 = r3[r2]
            r6 = 13
            if (r3 == r6) goto L37
            r6 = 44
            r7 = 32
            if (r3 == r6) goto L33
            r6 = 46
            if (r3 == r6) goto L2f
            r6 = 58
            if (r3 == r6) goto L2b
            goto L3d
        L2b:
            if (r5 != r7) goto L3d
            r3 = 5
            goto L3e
        L2f:
            if (r5 != r7) goto L3d
            r3 = 3
            goto L3e
        L33:
            if (r5 != r7) goto L3d
            r3 = 4
            goto L3e
        L37:
            r3 = 10
            if (r5 != r3) goto L3d
            r3 = 2
            goto L3e
        L3d:
            r3 = 0
        L3e:
            if (r3 <= 0) goto L46
            java.util.Collection r0 = a(r0, r2, r3)
            r2 = r4
            goto L4a
        L46:
            java.util.Collection r0 = r8.a(r0, r2)
        L4a:
            int r2 = r2 + 1
            goto L8
        L4d:
            com.huawei.hms.scankit.p.c4$a r1 = new com.huawei.hms.scankit.p.c4$a
            r1.<init>()
            java.lang.Object r0 = java.util.Collections.min(r0, r1)
            com.huawei.hms.scankit.p.b7 r0 = (com.huawei.hms.scankit.p.b7) r0
            byte[] r1 = r8.a
            com.huawei.hms.scankit.p.r r0 = r0.a(r1)
            return r0
    }
}

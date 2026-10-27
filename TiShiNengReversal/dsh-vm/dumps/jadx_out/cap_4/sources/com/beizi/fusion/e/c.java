package com.beizi.fusion.e;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class c {
    public c() {
            r1 = this;
            r1.<init>()
            return
    }

    private static int a(int r3, java.lang.String r4, int r5) {
            r4.getClass()
            int r0 = r4.hashCode()
            r1 = 0
            r2 = -1
            switch(r0) {
                case 37: goto L39;
                case 42: goto L2e;
                case 43: goto L23;
                case 45: goto L18;
                case 47: goto Ld;
                default: goto Lc;
            }
        Lc:
            goto L43
        Ld:
            java.lang.String r0 = "/"
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto L16
            goto L43
        L16:
            r2 = 4
            goto L43
        L18:
            java.lang.String r0 = "-"
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto L21
            goto L43
        L21:
            r2 = 3
            goto L43
        L23:
            java.lang.String r0 = "+"
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto L2c
            goto L43
        L2c:
            r2 = 2
            goto L43
        L2e:
            java.lang.String r0 = "*"
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto L37
            goto L43
        L37:
            r2 = 1
            goto L43
        L39:
            java.lang.String r0 = "%"
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto L42
            goto L43
        L42:
            r2 = 0
        L43:
            switch(r2) {
                case 0: goto L50;
                case 1: goto L4d;
                case 2: goto L4b;
                case 3: goto L49;
                case 4: goto L47;
                default: goto L46;
            }
        L46:
            return r1
        L47:
            int r3 = r3 / r5
            return r3
        L49:
            int r3 = r3 - r5
            return r3
        L4b:
            int r3 = r3 + r5
            return r3
        L4d:
            int r3 = r3 * r5
            return r3
        L50:
            int r3 = r3 % r5
            return r3
    }

    public static int a(java.lang.String r9) {
            java.util.Stack r0 = new java.util.Stack
            r0.<init>()
            java.util.Stack r1 = new java.util.Stack
            r1.<init>()
            int r2 = r9.length()
            r3 = 0
        Lf:
            java.lang.String r4 = ""
            if (r3 >= r2) goto L15c
            char r5 = r9.charAt(r3)
            r6 = 48
            if (r5 < r6) goto L51
            r7 = 57
            if (r5 > r7) goto L51
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r4)
            r8.append(r5)
            java.lang.String r4 = r8.toString()
        L2e:
            int r5 = r3 + 1
            if (r5 >= r2) goto L4c
            char r8 = r9.charAt(r5)
            if (r8 < r6) goto L4c
            if (r8 <= r7) goto L3b
            goto L4c
        L3b:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r4)
            r3.append(r8)
            java.lang.String r4 = r3.toString()
            r3 = r5
            goto L2e
        L4c:
            r0.push(r4)
            goto L141
        L51:
            r6 = 40
            if (r5 != r6) goto L69
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r4)
            r6.append(r5)
            java.lang.String r4 = r6.toString()
            r1.push(r4)
            goto L141
        L69:
            r6 = 41
            if (r5 != r6) goto Lb1
        L6d:
            java.lang.Object r5 = r1.peek()
            java.lang.String r5 = (java.lang.String) r5
            java.lang.String r6 = "("
            boolean r5 = r5.equals(r6)
            if (r5 != 0) goto Lac
            java.lang.Object r5 = r1.pop()
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r6 = r0.pop()
            java.lang.String r6 = (java.lang.String) r6
            int r6 = java.lang.Integer.parseInt(r6)
            java.lang.Object r7 = r0.pop()
            java.lang.String r7 = (java.lang.String) r7
            int r7 = java.lang.Integer.parseInt(r7)
            int r5 = a(r7, r5, r6)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r4)
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            r0.push(r5)
            goto L6d
        Lac:
            r1.pop()
            goto L141
        Lb1:
            boolean r6 = a(r5)
            if (r6 == 0) goto L145
            boolean r6 = r1.empty()
            if (r6 == 0) goto Ld0
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r4)
            r6.append(r5)
            java.lang.String r4 = r6.toString()
            r1.push(r4)
            goto L141
        Ld0:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r4)
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            java.lang.Object r6 = r1.peek()
            java.lang.String r6 = (java.lang.String) r6
            float r7 = b(r5)
            float r6 = b(r6)
            int r6 = (r7 > r6 ? 1 : (r7 == r6 ? 0 : -1))
            if (r6 <= 0) goto Lf5
            r1.push(r5)
            goto L141
        Lf5:
            boolean r6 = r1.empty()
            if (r6 != 0) goto L13e
            float r6 = b(r5)
            java.lang.Object r7 = r1.peek()
            java.lang.String r7 = (java.lang.String) r7
            float r7 = b(r7)
            int r6 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r6 > 0) goto L13e
            java.lang.Object r6 = r1.pop()
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r7 = r0.pop()
            java.lang.String r7 = (java.lang.String) r7
            int r7 = java.lang.Integer.parseInt(r7)
            java.lang.Object r8 = r0.pop()
            java.lang.String r8 = (java.lang.String) r8
            int r8 = java.lang.Integer.parseInt(r8)
            int r6 = a(r8, r6, r7)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r4)
            r7.append(r6)
            java.lang.String r6 = r7.toString()
            r0.push(r6)
            goto Lf5
        L13e:
            r1.push(r5)
        L141:
            int r3 = r3 + 1
            goto Lf
        L145:
            java.lang.RuntimeException r9 = new java.lang.RuntimeException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "无法识别"
            r0.append(r1)
            r0.append(r5)
            java.lang.String r0 = r0.toString()
            r9.<init>(r0)
            throw r9
        L15c:
            boolean r9 = r1.empty()
            if (r9 != 0) goto L193
            java.lang.Object r9 = r1.pop()
            java.lang.String r9 = (java.lang.String) r9
            java.lang.Object r2 = r0.pop()
            java.lang.String r2 = (java.lang.String) r2
            int r2 = java.lang.Integer.parseInt(r2)
            java.lang.Object r3 = r0.pop()
            java.lang.String r3 = (java.lang.String) r3
            int r3 = java.lang.Integer.parseInt(r3)
            int r9 = a(r3, r9, r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r4)
            r2.append(r9)
            java.lang.String r9 = r2.toString()
            r0.push(r9)
            goto L15c
        L193:
            java.lang.Object r9 = r0.pop()
            java.lang.String r9 = (java.lang.String) r9
            int r9 = java.lang.Integer.parseInt(r9)
            return r9
    }

    private static boolean a(char r1) {
            r0 = 43
            if (r1 == r0) goto L17
            r0 = 45
            if (r1 == r0) goto L17
            r0 = 42
            if (r1 == r0) goto L17
            r0 = 47
            if (r1 == r0) goto L17
            r0 = 37
            if (r1 != r0) goto L15
            goto L17
        L15:
            r1 = 0
            return r1
        L17:
            r1 = 1
            return r1
    }

    private static float b(java.lang.String r2) {
            r2.getClass()
            int r0 = r2.hashCode()
            r1 = -1
            switch(r0) {
                case 37: goto L43;
                case 38: goto Lb;
                case 39: goto Lb;
                case 40: goto L38;
                case 41: goto Lb;
                case 42: goto L2d;
                case 43: goto L22;
                case 44: goto Lb;
                case 45: goto L17;
                case 46: goto Lb;
                case 47: goto Lc;
                default: goto Lb;
            }
        Lb:
            goto L4d
        Lc:
            java.lang.String r0 = "/"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L15
            goto L4d
        L15:
            r1 = 5
            goto L4d
        L17:
            java.lang.String r0 = "-"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L20
            goto L4d
        L20:
            r1 = 4
            goto L4d
        L22:
            java.lang.String r0 = "+"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L2b
            goto L4d
        L2b:
            r1 = 3
            goto L4d
        L2d:
            java.lang.String r0 = "*"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L36
            goto L4d
        L36:
            r1 = 2
            goto L4d
        L38:
            java.lang.String r0 = "("
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L41
            goto L4d
        L41:
            r1 = 1
            goto L4d
        L43:
            java.lang.String r0 = "%"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L4c
            goto L4d
        L4c:
            r1 = 0
        L4d:
            switch(r1) {
                case 0: goto L58;
                case 1: goto L56;
                case 2: goto L58;
                case 3: goto L53;
                case 4: goto L53;
                case 5: goto L58;
                default: goto L50;
            }
        L50:
            r2 = -1082130432(0xffffffffbf800000, float:-1.0)
            return r2
        L53:
            r2 = 1065353216(0x3f800000, float:1.0)
            return r2
        L56:
            r2 = 0
            return r2
        L58:
            r2 = 1073741824(0x40000000, float:2.0)
            return r2
    }
}

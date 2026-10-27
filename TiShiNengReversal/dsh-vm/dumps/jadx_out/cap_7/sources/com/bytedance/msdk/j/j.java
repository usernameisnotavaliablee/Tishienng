package com.bytedance.msdk.j;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
public abstract class j {
    public j() {
            r1 = this;
            r1.<init>()
            return
    }

    public static java.lang.String j(java.lang.String r6, java.lang.String r7) {
            boolean r0 = android.text.TextUtils.isEmpty(r7)
            java.lang.String r1 = ""
            if (r0 == 0) goto L9
            return r1
        L9:
            java.lang.String r0 = "pangle"
            boolean r6 = android.text.TextUtils.equals(r6, r0)
            r0 = 1
            r2 = 0
            if (r6 == 0) goto L44
            java.lang.String r6 = "message:"
            java.lang.String[] r6 = r7.split(r6)
            if (r6 == 0) goto L43
            int r7 = r6.length
            if (r7 <= 0) goto L43
            r6 = r6[r2]
            boolean r7 = android.text.TextUtils.isEmpty(r6)
            if (r7 != 0) goto L43
            java.lang.String r6 = r6.trim()
            java.lang.String r7 = ":"
            java.lang.String[] r6 = r6.split(r7)
            if (r6 == 0) goto L43
            int r7 = r6.length
            r2 = 2
            if (r7 < r2) goto L43
            r6 = r6[r0]
            boolean r7 = android.text.TextUtils.isEmpty(r6)
            if (r7 != 0) goto L43
            java.lang.String r6 = r6.trim()
            return r6
        L43:
            return r1
        L44:
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            char[] r7 = r7.toCharArray()
            r3 = 0
        L53:
            int r4 = r7.length
            if (r3 >= r4) goto L93
            char r4 = r7[r3]
            r5 = 48
            if (r4 < r5) goto L6f
            r5 = 57
            if (r4 > r5) goto L6f
            r1.append(r4)
            int r4 = r7.length
            int r4 = r4 - r0
            if (r3 != r4) goto L83
            java.lang.String r7 = r1.toString()
            r6.add(r7)
            goto L93
        L6f:
            int r4 = r1.length()
            if (r4 <= 0) goto L83
            java.lang.String r4 = r1.toString()
            r6.add(r4)
            int r4 = r1.length()
            r1.delete(r2, r4)
        L83:
            int r4 = r6.size()
            if (r4 <= 0) goto L90
            java.lang.Object r6 = r6.get(r2)
            java.lang.String r6 = (java.lang.String) r6
            return r6
        L90:
            int r3 = r3 + 1
            goto L53
        L93:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.util.Iterator r6 = r6.iterator()
        L9c:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto Lb1
            java.lang.Object r1 = r6.next()
            java.lang.String r1 = (java.lang.String) r1
            r7.append(r1)
            java.lang.String r1 = "_"
            r7.append(r1)
            goto L9c
        Lb1:
            int r6 = r7.length()
            if (r6 <= 0) goto Lc3
            int r6 = r7.length()
            int r6 = r6 - r0
            int r0 = r7.length()
            r7.delete(r6, r0)
        Lc3:
            java.lang.String r6 = r7.toString()
            return r6
    }

    public static java.lang.String j(java.lang.String r1, java.lang.String r2, java.lang.String r3) {
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 == 0) goto L7
            goto L18
        L7:
            java.lang.String r0 = "gdt"
            boolean r0 = android.text.TextUtils.equals(r1, r0)
            if (r0 != 0) goto L19
            java.lang.String r0 = "pangle"
            boolean r1 = android.text.TextUtils.equals(r1, r0)
            if (r1 == 0) goto L18
            goto L19
        L18:
            return r2
        L19:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r2)
            java.lang.String r2 = "_"
            r1.append(r2)
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            return r1
    }

    public static boolean j() {
            android.content.Context r0 = com.bytedance.msdk.core.xt.getContext()
            boolean r0 = com.bytedance.msdk.tl.x.cw(r0)
            android.content.Context r1 = com.bytedance.msdk.core.xt.getContext()
            boolean r1 = com.bytedance.msdk.tl.x.xt(r1)
            com.bytedance.msdk.core.ws.cw r2 = com.bytedance.msdk.core.xt.xt()
            boolean r2 = r2.vl()
            if (r2 == 0) goto L20
            if (r0 != 0) goto L1e
            if (r1 == 0) goto L20
        L1e:
            r0 = 1
            return r0
        L20:
            r0 = 0
            return r0
    }
}

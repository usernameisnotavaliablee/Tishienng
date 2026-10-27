package com.alibaba.fastjson.asm;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
final class Item {
    int hashCode;
    int index;
    int intVal;
    long longVal;
    com.alibaba.fastjson.asm.Item next;
    java.lang.String strVal1;
    java.lang.String strVal2;
    java.lang.String strVal3;
    int type;

    Item() {
            r0 = this;
            r0.<init>()
            return
    }

    Item(int r3, com.alibaba.fastjson.asm.Item r4) {
            r2 = this;
            r2.<init>()
            r2.index = r3
            int r3 = r4.type
            r2.type = r3
            int r3 = r4.intVal
            r2.intVal = r3
            long r0 = r4.longVal
            r2.longVal = r0
            java.lang.String r3 = r4.strVal1
            r2.strVal1 = r3
            java.lang.String r3 = r4.strVal2
            r2.strVal2 = r3
            java.lang.String r3 = r4.strVal3
            r2.strVal3 = r3
            int r3 = r4.hashCode
            r2.hashCode = r3
            return
    }

    boolean isEqualTo(com.alibaba.fastjson.asm.Item r9) {
            r8 = this;
            int r0 = r8.type
            r1 = 1
            if (r0 == r1) goto L5d
            r2 = 15
            r3 = 0
            if (r0 == r2) goto L53
            r2 = 12
            if (r0 == r2) goto L3d
            r2 = 13
            if (r0 == r2) goto L5d
            switch(r0) {
                case 3: goto L35;
                case 4: goto L35;
                case 5: goto L53;
                case 6: goto L53;
                case 7: goto L5d;
                case 8: goto L5d;
                default: goto L15;
            }
        L15:
            java.lang.String r0 = r9.strVal1
            java.lang.String r2 = r8.strVal1
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L34
            java.lang.String r0 = r9.strVal2
            java.lang.String r2 = r8.strVal2
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L34
            java.lang.String r9 = r9.strVal3
            java.lang.String r0 = r8.strVal3
            boolean r9 = r9.equals(r0)
            if (r9 == 0) goto L34
            return r1
        L34:
            return r3
        L35:
            int r9 = r9.intVal
            int r0 = r8.intVal
            if (r9 != r0) goto L3c
            return r1
        L3c:
            return r3
        L3d:
            java.lang.String r0 = r9.strVal1
            java.lang.String r2 = r8.strVal1
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L52
            java.lang.String r9 = r9.strVal2
            java.lang.String r0 = r8.strVal2
            boolean r9 = r9.equals(r0)
            if (r9 == 0) goto L52
            return r1
        L52:
            return r3
        L53:
            long r4 = r9.longVal
            long r6 = r8.longVal
            int r9 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r9 != 0) goto L5c
            return r1
        L5c:
            return r3
        L5d:
            java.lang.String r9 = r9.strVal1
            java.lang.String r0 = r8.strVal1
            boolean r9 = r9.equals(r0)
            return r9
    }

    void set(int r3) {
            r2 = this;
            r0 = 3
            r2.type = r0
            r2.intVal = r3
            r1 = 2147483647(0x7fffffff, float:NaN)
            int r0 = r0 + r3
            r3 = r0 & r1
            r2.hashCode = r3
            return
    }

    void set(int r3, java.lang.String r4, java.lang.String r5, java.lang.String r6) {
            r2 = this;
            r2.type = r3
            r2.strVal1 = r4
            r2.strVal2 = r5
            r2.strVal3 = r6
            r0 = 1
            r1 = 2147483647(0x7fffffff, float:NaN)
            if (r3 == r0) goto L41
            r0 = 7
            if (r3 == r0) goto L41
            r0 = 8
            if (r3 == r0) goto L41
            r0 = 12
            if (r3 == r0) goto L32
            r0 = 13
            if (r3 == r0) goto L41
            int r4 = r4.hashCode()
            int r5 = r5.hashCode()
            int r4 = r4 * r5
            int r5 = r6.hashCode()
            int r4 = r4 * r5
            int r3 = r3 + r4
            r3 = r3 & r1
            r2.hashCode = r3
            return
        L32:
            int r4 = r4.hashCode()
            int r5 = r5.hashCode()
            int r4 = r4 * r5
            int r3 = r3 + r4
            r3 = r3 & r1
            r2.hashCode = r3
            return
        L41:
            int r4 = r4.hashCode()
            int r3 = r3 + r4
            r3 = r3 & r1
            r2.hashCode = r3
            return
    }
}

package com.tencent.bugly.proguard;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public final class a {
    public a() {
            r1 = this;
            r1.<init>()
            return
    }

    public static java.lang.String a(java.util.ArrayList<java.lang.String> r9) {
            java.lang.StringBuffer r0 = new java.lang.StringBuffer
            r0.<init>()
            r1 = 0
            r2 = 0
        L7:
            int r3 = r9.size()
            java.lang.String r4 = "map"
            java.lang.String r5 = "list"
            if (r2 >= r3) goto Ld6
            java.lang.Object r3 = r9.get(r2)
            java.lang.String r3 = (java.lang.String) r3
            java.lang.String r6 = "java.lang.Integer"
            boolean r6 = r3.equals(r6)
            if (r6 != 0) goto Lcd
            java.lang.String r6 = "int"
            boolean r6 = r3.equals(r6)
            if (r6 == 0) goto L29
            goto Lcd
        L29:
            java.lang.String r6 = "java.lang.Boolean"
            boolean r6 = r3.equals(r6)
            if (r6 != 0) goto Lca
            java.lang.String r6 = "boolean"
            boolean r6 = r3.equals(r6)
            if (r6 == 0) goto L3b
            goto Lca
        L3b:
            java.lang.String r6 = "java.lang.Byte"
            boolean r6 = r3.equals(r6)
            if (r6 != 0) goto Lc7
            java.lang.String r6 = "byte"
            boolean r6 = r3.equals(r6)
            if (r6 == 0) goto L4d
            goto Lc7
        L4d:
            java.lang.String r6 = "java.lang.Double"
            boolean r6 = r3.equals(r6)
            java.lang.String r7 = "double"
            if (r6 != 0) goto Lc2
            boolean r6 = r3.equals(r7)
            if (r6 == 0) goto L5f
            goto Lc2
        L5f:
            java.lang.String r6 = "java.lang.Float"
            boolean r6 = r3.equals(r6)
            java.lang.String r7 = "float"
            if (r6 != 0) goto Lc2
            boolean r6 = r3.equals(r7)
            if (r6 == 0) goto L70
            goto Lc2
        L70:
            java.lang.String r6 = "java.lang.Long"
            boolean r6 = r3.equals(r6)
            if (r6 != 0) goto Lc4
            java.lang.String r6 = "long"
            boolean r6 = r3.equals(r6)
            if (r6 == 0) goto L81
            goto Lc4
        L81:
            java.lang.String r6 = "java.lang.Short"
            boolean r6 = r3.equals(r6)
            java.lang.String r7 = "short"
            if (r6 != 0) goto Lc2
            boolean r6 = r3.equals(r7)
            if (r6 == 0) goto L92
            goto Lc2
        L92:
            java.lang.String r6 = "java.lang.Character"
            boolean r6 = r3.equals(r6)
            if (r6 != 0) goto Lba
            java.lang.String r6 = "java.lang.String"
            boolean r6 = r3.equals(r6)
            if (r6 == 0) goto La5
            java.lang.String r4 = "string"
            goto Lcf
        La5:
            java.lang.String r6 = "java.util.List"
            boolean r6 = r3.equals(r6)
            if (r6 == 0) goto Laf
            r4 = r5
            goto Lcf
        Laf:
            java.lang.String r5 = "java.util.Map"
            boolean r5 = r3.equals(r5)
            if (r5 == 0) goto Lb8
            goto Lcf
        Lb8:
            r4 = r3
            goto Lcf
        Lba:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "can not support java.lang.Character"
            r9.<init>(r0)
            throw r9
        Lc2:
            r4 = r7
            goto Lcf
        Lc4:
            java.lang.String r4 = "int64"
            goto Lcf
        Lc7:
            java.lang.String r4 = "char"
            goto Lcf
        Lca:
            java.lang.String r4 = "bool"
            goto Lcf
        Lcd:
            java.lang.String r4 = "int32"
        Lcf:
            r9.set(r2, r4)
            int r2 = r2 + 1
            goto L7
        Ld6:
            java.util.Collections.reverse(r9)
            r2 = 0
        Lda:
            int r3 = r9.size()
            if (r2 >= r3) goto L196
            java.lang.Object r3 = r9.get(r2)
            java.lang.String r3 = (java.lang.String) r3
            boolean r6 = r3.equals(r5)
            java.lang.String r7 = ">"
            java.lang.String r8 = "<"
            if (r6 == 0) goto L120
            int r3 = r2 + (-1)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>(r8)
            java.lang.Object r8 = r9.get(r3)
            java.lang.String r8 = (java.lang.String) r8
            r6.append(r8)
            java.lang.String r6 = r6.toString()
            r9.set(r3, r6)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.Object r6 = r9.get(r1)
            java.lang.String r6 = (java.lang.String) r6
            r3.append(r6)
            r3.append(r7)
            java.lang.String r3 = r3.toString()
            r9.set(r1, r3)
            goto L192
        L120:
            boolean r6 = r3.equals(r4)
            if (r6 == 0) goto L15b
            int r3 = r2 + (-1)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>(r8)
            java.lang.Object r8 = r9.get(r3)
            java.lang.String r8 = (java.lang.String) r8
            r6.append(r8)
            java.lang.String r8 = ","
            r6.append(r8)
            java.lang.String r6 = r6.toString()
            r9.set(r3, r6)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.Object r6 = r9.get(r1)
            java.lang.String r6 = (java.lang.String) r6
            r3.append(r6)
            r3.append(r7)
            java.lang.String r3 = r3.toString()
            r9.set(r1, r3)
            goto L192
        L15b:
            java.lang.String r6 = "Array"
            boolean r3 = r3.equals(r6)
            if (r3 == 0) goto L192
            int r3 = r2 + (-1)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>(r8)
            java.lang.Object r8 = r9.get(r3)
            java.lang.String r8 = (java.lang.String) r8
            r6.append(r8)
            java.lang.String r6 = r6.toString()
            r9.set(r3, r6)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.Object r6 = r9.get(r1)
            java.lang.String r6 = (java.lang.String) r6
            r3.append(r6)
            r3.append(r7)
            java.lang.String r3 = r3.toString()
            r9.set(r1, r3)
        L192:
            int r2 = r2 + 1
            goto Lda
        L196:
            java.util.Collections.reverse(r9)
            java.util.Iterator r9 = r9.iterator()
        L19d:
            boolean r1 = r9.hasNext()
            if (r1 == 0) goto L1ad
            java.lang.Object r1 = r9.next()
            java.lang.String r1 = (java.lang.String) r1
            r0.append(r1)
            goto L19d
        L1ad:
            java.lang.String r9 = r0.toString()
            return r9
    }
}

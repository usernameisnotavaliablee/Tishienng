package androidx.core.content;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class ContentValuesKt {
    @org.jetbrains.annotations.NotNull
    public static final android.content.ContentValues contentValuesOf(@org.jetbrains.annotations.NotNull kotlin.Pair<java.lang.String, ? extends java.lang.Object>... r6) {
            android.content.ContentValues r0 = new android.content.ContentValues
            int r1 = r6.length
            r0.<init>(r1)
            int r1 = r6.length
            r2 = 0
        L8:
            if (r2 >= r1) goto La4
            r3 = r6[r2]
            java.lang.Object r4 = r3.component1()
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r3 = r3.component2()
            if (r3 != 0) goto L1c
            r0.putNull(r4)
            goto L75
        L1c:
            boolean r5 = r3 instanceof java.lang.String
            if (r5 == 0) goto L26
            java.lang.String r3 = (java.lang.String) r3
            r0.put(r4, r3)
            goto L75
        L26:
            boolean r5 = r3 instanceof java.lang.Integer
            if (r5 == 0) goto L30
            java.lang.Integer r3 = (java.lang.Integer) r3
            r0.put(r4, r3)
            goto L75
        L30:
            boolean r5 = r3 instanceof java.lang.Long
            if (r5 == 0) goto L3a
            java.lang.Long r3 = (java.lang.Long) r3
            r0.put(r4, r3)
            goto L75
        L3a:
            boolean r5 = r3 instanceof java.lang.Boolean
            if (r5 == 0) goto L44
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            r0.put(r4, r3)
            goto L75
        L44:
            boolean r5 = r3 instanceof java.lang.Float
            if (r5 == 0) goto L4e
            java.lang.Float r3 = (java.lang.Float) r3
            r0.put(r4, r3)
            goto L75
        L4e:
            boolean r5 = r3 instanceof java.lang.Double
            if (r5 == 0) goto L58
            java.lang.Double r3 = (java.lang.Double) r3
            r0.put(r4, r3)
            goto L75
        L58:
            boolean r5 = r3 instanceof byte[]
            if (r5 == 0) goto L62
            byte[] r3 = (byte[]) r3
            r0.put(r4, r3)
            goto L75
        L62:
            boolean r5 = r3 instanceof java.lang.Byte
            if (r5 == 0) goto L6c
            java.lang.Byte r3 = (java.lang.Byte) r3
            r0.put(r4, r3)
            goto L75
        L6c:
            boolean r5 = r3 instanceof java.lang.Short
            if (r5 == 0) goto L78
            java.lang.Short r3 = (java.lang.Short) r3
            r0.put(r4, r3)
        L75:
            int r2 = r2 + 1
            goto L8
        L78:
            java.lang.Class r6 = r3.getClass()
            java.lang.String r6 = r6.getCanonicalName()
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Illegal value type "
            r1.append(r2)
            r1.append(r6)
            java.lang.String r6 = " for key \""
            r1.append(r6)
            r1.append(r4)
            r6 = 34
            r1.append(r6)
            java.lang.String r6 = r1.toString()
            r0.<init>(r6)
            throw r0
        La4:
            return r0
    }
}

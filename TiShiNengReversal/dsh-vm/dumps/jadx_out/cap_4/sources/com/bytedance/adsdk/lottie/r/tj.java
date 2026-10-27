package com.bytedance.adsdk.lottie.r;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
class tj {
    public tj() {
            r1 = this;
            r1.<init>()
            return
    }

    static <T> java.util.List<com.bytedance.adsdk.lottie.m.j<T>> j(android.util.JsonReader r9, com.bytedance.adsdk.lottie.m r10, float r11, com.bytedance.adsdk.lottie.r.nd<T> r12, boolean r13) throws java.io.IOException {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            android.util.JsonToken r1 = r9.peek()
            android.util.JsonToken r2 = android.util.JsonToken.STRING
            if (r1 != r2) goto L13
            java.lang.String r9 = "Lottie doesn't support expressions."
            r10.j(r9)
            return r0
        L13:
            r9.beginObject()
        L16:
            boolean r1 = r9.hasNext()
            if (r1 == 0) goto L81
            java.lang.String r1 = r9.nextName()
            r1.getClass()
            java.lang.String r2 = "k"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L2f
            r9.skipValue()
            goto L16
        L2f:
            android.util.JsonToken r1 = r9.peek()
            android.util.JsonToken r2 = android.util.JsonToken.BEGIN_ARRAY
            if (r1 != r2) goto L72
            r9.beginArray()
            android.util.JsonToken r1 = r9.peek()
            android.util.JsonToken r2 = android.util.JsonToken.NUMBER
            if (r1 != r2) goto L55
            r7 = 0
            r3 = r9
            r4 = r10
            r5 = r11
            r6 = r12
            r8 = r13
            com.bytedance.adsdk.lottie.m.j r9 = com.bytedance.adsdk.lottie.r.kt.j(r3, r4, r5, r6, r7, r8)
            r1 = r3
            r2 = r4
            r3 = r5
            r4 = r6
            r6 = r8
            r0.add(r9)
            goto L69
        L55:
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r6 = r13
        L5a:
            boolean r9 = r1.hasNext()
            if (r9 == 0) goto L69
            r5 = 1
            com.bytedance.adsdk.lottie.m.j r9 = com.bytedance.adsdk.lottie.r.kt.j(r1, r2, r3, r4, r5, r6)
            r0.add(r9)
            goto L5a
        L69:
            r1.endArray()
            r9 = r1
            r10 = r2
            r11 = r3
            r12 = r4
            r13 = r6
            goto L16
        L72:
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r6 = r13
            r5 = 0
            com.bytedance.adsdk.lottie.m.j r9 = com.bytedance.adsdk.lottie.r.kt.j(r1, r2, r3, r4, r5, r6)
            r0.add(r9)
            r9 = r1
            goto L16
        L81:
            r1 = r9
            r1.endObject()
            j(r0)
            return r0
    }

    public static <T> void j(java.util.List<? extends com.bytedance.adsdk.lottie.m.j<T>> r5) {
            int r0 = r5.size()
            r1 = 0
        L5:
            r2 = 1
            int r3 = r0 + (-1)
            if (r1 >= r3) goto L34
            java.lang.Object r2 = r5.get(r1)
            com.bytedance.adsdk.lottie.m.j r2 = (com.bytedance.adsdk.lottie.m.j) r2
            int r1 = r1 + 1
            java.lang.Object r3 = r5.get(r1)
            com.bytedance.adsdk.lottie.m.j r3 = (com.bytedance.adsdk.lottie.m.j) r3
            float r4 = r3.f1820m
            java.lang.Float r4 = java.lang.Float.valueOf(r4)
            r2.ae = r4
            T r4 = r2.xt
            if (r4 != 0) goto L5
            T r3 = r3.j
            if (r3 == 0) goto L5
            r2.xt = r3
            boolean r3 = r2 instanceof com.bytedance.adsdk.lottie.j.xt.g
            if (r3 == 0) goto L5
            com.bytedance.adsdk.lottie.j.xt.g r2 = (com.bytedance.adsdk.lottie.j.xt.g) r2
            r2.j()
            goto L5
        L34:
            java.lang.Object r0 = r5.get(r3)
            com.bytedance.adsdk.lottie.m.j r0 = (com.bytedance.adsdk.lottie.m.j) r0
            T r1 = r0.j
            if (r1 == 0) goto L42
            T r1 = r0.xt
            if (r1 != 0) goto L4b
        L42:
            int r1 = r5.size()
            if (r1 <= r2) goto L4b
            r5.remove(r0)
        L4b:
            return
    }
}

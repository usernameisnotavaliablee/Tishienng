package com.bytedance.adsdk.lottie.r;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
class ws {
    public ws() {
            r1 = this;
            r1.<init>()
            return
    }

    static com.bytedance.adsdk.lottie.model.cw j(android.util.JsonReader r7) throws java.io.IOException {
            r7.beginObject()
            r0 = 0
            r1 = 0
            r1 = r0
            r2 = r1
            r3 = 0
        L8:
            boolean r4 = r7.hasNext()
            if (r4 == 0) goto L65
            java.lang.String r4 = r7.nextName()
            r4.getClass()
            int r5 = r4.hashCode()
            r6 = -1
            switch(r5) {
                case -1866931350: goto L3f;
                case -1408684838: goto L34;
                case -1294566165: goto L29;
                case 96619537: goto L1e;
                default: goto L1d;
            }
        L1d:
            goto L49
        L1e:
            java.lang.String r5 = "fName"
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L27
            goto L49
        L27:
            r6 = 3
            goto L49
        L29:
            java.lang.String r5 = "fStyle"
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L32
            goto L49
        L32:
            r6 = 2
            goto L49
        L34:
            java.lang.String r5 = "ascent"
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L3d
            goto L49
        L3d:
            r6 = 1
            goto L49
        L3f:
            java.lang.String r5 = "fFamily"
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L48
            goto L49
        L48:
            r6 = 0
        L49:
            switch(r6) {
                case 0: goto L60;
                case 1: goto L5a;
                case 2: goto L55;
                case 3: goto L50;
                default: goto L4c;
            }
        L4c:
            r7.skipValue()
            goto L8
        L50:
            java.lang.String r1 = r7.nextString()
            goto L8
        L55:
            java.lang.String r2 = r7.nextString()
            goto L8
        L5a:
            double r3 = r7.nextDouble()
            float r3 = (float) r3
            goto L8
        L60:
            java.lang.String r0 = r7.nextString()
            goto L8
        L65:
            r7.endObject()
            com.bytedance.adsdk.lottie.model.cw r7 = new com.bytedance.adsdk.lottie.model.cw
            r7.<init>(r0, r1, r2, r3)
            return r7
    }
}

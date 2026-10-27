package com.bytedance.adsdk.xt.xt;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class j {
    private static final com.bytedance.adsdk.xt.xt.cw.j j = null;
    private com.bytedance.adsdk.xt.xt.xt.j cw;

    /* renamed from: r, reason: collision with root package name */
    private java.util.Deque<com.bytedance.adsdk.xt.xt.xt.j> f2064r;
    private java.lang.String up;
    private final com.bytedance.adsdk.xt.xt.cw.j xt;



    static {
            com.bytedance.adsdk.xt.xt.cw.j.oq r0 = new com.bytedance.adsdk.xt.xt.cw.j.oq
            r0.<init>()
            com.bytedance.adsdk.xt.xt.cw.j.r r1 = new com.bytedance.adsdk.xt.xt.cw.j.r
            r1.<init>()
            com.bytedance.adsdk.xt.xt.cw.j.g r2 = new com.bytedance.adsdk.xt.xt.cw.j.g
            r2.<init>()
            com.bytedance.adsdk.xt.xt.cw.j.xt r3 = new com.bytedance.adsdk.xt.xt.cw.j.xt
            r3.<init>()
            com.bytedance.adsdk.xt.xt.cw.j.up r4 = new com.bytedance.adsdk.xt.xt.cw.j.up
            r4.<init>()
            com.bytedance.adsdk.xt.xt.cw.j.j r5 = new com.bytedance.adsdk.xt.xt.cw.j.j
            r5.<init>()
            com.bytedance.adsdk.xt.xt.cw.j.ae r6 = new com.bytedance.adsdk.xt.xt.cw.j.ae
            r6.<init>()
            com.bytedance.adsdk.xt.xt.cw.j.cw r7 = new com.bytedance.adsdk.xt.xt.cw.j.cw
            r7.<init>()
            com.bytedance.adsdk.xt.xt.cw.j.tl r8 = new com.bytedance.adsdk.xt.xt.cw.j.tl
            r8.<init>()
            r9 = 9
            com.bytedance.adsdk.xt.xt.cw.j.m[] r9 = new com.bytedance.adsdk.xt.xt.cw.j.m[r9]
            r10 = 0
            r9[r10] = r0
            r0 = 1
            r9[r0] = r1
            r0 = 2
            r9[r0] = r2
            r0 = 3
            r9[r0] = r3
            r0 = 4
            r9[r0] = r4
            r0 = 5
            r9[r0] = r5
            r0 = 6
            r9[r0] = r6
            r0 = 7
            r9[r0] = r7
            r0 = 8
            r9[r0] = r8
            com.bytedance.adsdk.xt.xt.j$1 r1 = new com.bytedance.adsdk.xt.xt.j$1
            r1.<init>()
        L52:
            if (r0 < 0) goto L5f
            r2 = r9[r0]
            com.bytedance.adsdk.xt.xt.j$2 r3 = new com.bytedance.adsdk.xt.xt.j$2
            r3.<init>(r2, r1)
            int r0 = r0 + (-1)
            r1 = r3
            goto L52
        L5f:
            com.bytedance.adsdk.xt.xt.j.j = r1
            return
    }

    private j(java.lang.String r2, com.bytedance.adsdk.xt.xt.cw.j r3) {
            r1 = this;
            r1.<init>()
            java.util.LinkedList r0 = new java.util.LinkedList
            r0.<init>()
            r1.f2064r = r0
            r1.xt = r3
            r1.up = r2
            r1.j()     // Catch: java.lang.Exception -> L12
            return
        L12:
            r3 = move-exception
            com.bytedance.adsdk.xt.j.xt r0 = new com.bytedance.adsdk.xt.j.xt
            r0.<init>(r2, r3)
            throw r0
    }

    public static com.bytedance.adsdk.xt.xt.j j(java.lang.String r2) {
            com.bytedance.adsdk.xt.xt.j r0 = new com.bytedance.adsdk.xt.xt.j
            com.bytedance.adsdk.xt.xt.cw.j r1 = com.bytedance.adsdk.xt.xt.j.j
            r0.<init>(r2, r1)
            return r0
    }

    private void j() {
            r6 = this;
            java.lang.String r0 = r6.up
            int r0 = r0.length()
            r1 = 0
            r2 = 0
        L8:
            if (r2 >= r0) goto L32
            com.bytedance.adsdk.xt.xt.cw.j r3 = r6.xt
            java.lang.String r4 = r6.up
            java.util.Deque<com.bytedance.adsdk.xt.xt.xt.j> r5 = r6.f2064r
            int r3 = r3.j(r4, r2, r5)
            if (r3 == r2) goto L18
            r2 = r3
            goto L8
        L18:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Unrecognized expression, unrecognized characters encountered during parsing:"
            r3.<init>(r4)
            java.lang.String r4 = r6.up
            java.lang.String r1 = r4.substring(r1, r2)
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            r0.<init>(r1)
            throw r0
        L32:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
        L37:
            java.util.Deque<com.bytedance.adsdk.xt.xt.xt.j> r3 = r6.f2064r
            java.lang.Object r3 = r3.pollFirst()
            com.bytedance.adsdk.xt.xt.xt.j r3 = (com.bytedance.adsdk.xt.xt.xt.j) r3
            if (r3 == 0) goto L45
            r0.add(r1, r3)
            goto L37
        L45:
            java.lang.String r1 = r6.up
            com.bytedance.adsdk.xt.xt.xt.j r0 = com.bytedance.adsdk.xt.xt.up.xt.j(r0, r1, r2)
            r6.cw = r0
            r0 = 0
            r6.f2064r = r0
            return
    }

    public <T> T j(java.util.Map<java.lang.String, org.json.JSONObject> r2) {
            r1 = this;
            com.bytedance.adsdk.xt.xt.xt.j r0 = r1.cw
            java.lang.Object r2 = r0.j(r2)
            return r2
    }

    public <T> T j(org.json.JSONObject r3) {
            r2 = this;
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.lang.String r1 = "default_key"
            r0.put(r1, r3)
            java.lang.Object r3 = r2.j(r0)
            return r3
    }
}

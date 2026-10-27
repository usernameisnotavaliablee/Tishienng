package com.bxkj.student.run.app.utils;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class h {
    private int a;
    private int b;
    private double c;
    private java.util.ArrayList<com.bxkj.student.run.app.utils.k> d;
    private java.util.ArrayList<com.bxkj.student.run.app.utils.k> e;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a implements java.util.Comparator<com.bxkj.student.run.app.utils.k> {
        final /* synthetic */ com.bxkj.student.run.app.utils.h a;

        a(com.bxkj.student.run.app.utils.h r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public int a(com.bxkj.student.run.app.utils.k r1, com.bxkj.student.run.app.utils.k r2) {
                r0 = this;
                int r1 = r1.a(r2)
                return r1
        }

        @Override // java.util.Comparator
        public /* bridge */ /* synthetic */ int compare(com.bxkj.student.run.app.utils.k r1, com.bxkj.student.run.app.utils.k r2) {
                r0 = this;
                com.bxkj.student.run.app.utils.k r1 = (com.bxkj.student.run.app.utils.k) r1
                com.bxkj.student.run.app.utils.k r2 = (com.bxkj.student.run.app.utils.k) r2
                int r1 = r0.a(r1, r2)
                return r1
        }
    }

    public h(java.util.ArrayList<com.amap.api.maps.model.LatLng> r3, double r4) {
            r2 = this;
            r2.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r2.d = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r2.e = r0
            if (r3 == 0) goto L3a
            r2.c = r4
            r4 = 0
            r2.a = r4
            int r5 = r3.size()
            int r5 = r5 + (-1)
            r2.b = r5
        L20:
            int r5 = r3.size()
            if (r4 >= r5) goto L39
            java.util.ArrayList<com.bxkj.student.run.app.utils.k> r5 = r2.d
            com.bxkj.student.run.app.utils.k r0 = new com.bxkj.student.run.app.utils.k
            java.lang.Object r1 = r3.get(r4)
            com.amap.api.maps.model.LatLng r1 = (com.amap.api.maps.model.LatLng) r1
            r0.<init>(r4, r1)
            r5.add(r0)
            int r4 = r4 + 1
            goto L20
        L39:
            return
        L3a:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r4 = "传入的经纬度坐标list为空"
            r3.<init>(r4)
            throw r3
    }

    private java.util.ArrayList<com.bxkj.student.run.app.utils.k> b(com.bxkj.student.run.app.utils.k[] r11, java.util.ArrayList<com.bxkj.student.run.app.utils.k> r12, int r13, int r14, double r15) {
            r10 = this;
            r0 = r11[r13]
            r1 = r11[r14]
            int r2 = r13 + 1
            r3 = 0
            r4 = 0
            r6 = 0
        La:
            if (r2 >= r14) goto L1b
            r3 = r11[r2]
            double r7 = r10.c(r0, r1, r3)
            int r3 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r3 <= 0) goto L18
            r6 = r2
            r4 = r7
        L18:
            int r2 = r2 + 1
            goto La
        L1b:
            int r0 = (r4 > r15 ? 1 : (r4 == r15 ? 0 : -1))
            if (r0 <= 0) goto L32
            r0 = r11[r6]
            r12.add(r0)
            r3 = r10
            r4 = r11
            r5 = r12
            r8 = r15
            r7 = r6
            r6 = r13
            r3.b(r4, r5, r6, r7, r8)
            r6 = r7
            r7 = r14
            r3.b(r4, r5, r6, r7, r8)
        L32:
            return r12
    }

    private double c(com.bxkj.student.run.app.utils.k r11, com.bxkj.student.run.app.utils.k r12, com.bxkj.student.run.app.utils.k r13) {
            r10 = this;
            com.amap.api.maps.model.LatLng r0 = r11.b
            com.amap.api.maps.model.LatLng r1 = r12.b
            float r0 = com.amap.api.maps.AMapUtils.calculateLineDistance(r0, r1)
            float r0 = java.lang.Math.abs(r0)
            double r0 = (double) r0
            com.amap.api.maps.model.LatLng r11 = r11.b
            com.amap.api.maps.model.LatLng r2 = r13.b
            float r11 = com.amap.api.maps.AMapUtils.calculateLineDistance(r11, r2)
            float r11 = java.lang.Math.abs(r11)
            double r2 = (double) r11
            com.amap.api.maps.model.LatLng r11 = r13.b
            com.amap.api.maps.model.LatLng r12 = r12.b
            float r11 = com.amap.api.maps.AMapUtils.calculateLineDistance(r11, r12)
            float r11 = java.lang.Math.abs(r11)
            double r11 = (double) r11
            double r4 = r0 + r2
            double r4 = r4 + r11
            r6 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r4 = r4 / r6
            double r8 = r4 - r0
            double r8 = r8 * r4
            double r2 = r4 - r2
            double r8 = r8 * r2
            double r4 = r4 - r11
            double r8 = r8 * r4
            double r11 = java.lang.Math.sqrt(r8)
            double r11 = r11 * r6
            double r11 = r11 / r0
            return r11
    }

    public java.util.ArrayList<com.amap.api.maps.model.LatLng> a() {
            r9 = this;
            java.util.ArrayList<com.bxkj.student.run.app.utils.k> r0 = r9.d
            int r0 = r0.size()
            java.util.ArrayList<com.bxkj.student.run.app.utils.k> r1 = r9.d
            com.bxkj.student.run.app.utils.k[] r2 = new com.bxkj.student.run.app.utils.k[r0]
            java.lang.Object[] r1 = r1.toArray(r2)
            r3 = r1
            com.bxkj.student.run.app.utils.k[] r3 = (com.bxkj.student.run.app.utils.k[]) r3
            java.util.ArrayList<com.bxkj.student.run.app.utils.k> r4 = r9.e
            int r5 = r9.a
            int r6 = r9.b
            double r7 = r9.c
            r2 = r9
            java.util.ArrayList r1 = r2.b(r3, r4, r5, r6, r7)
            java.util.ArrayList<com.bxkj.student.run.app.utils.k> r3 = r2.d
            r4 = 0
            java.lang.Object r3 = r3.get(r4)
            com.bxkj.student.run.app.utils.k r3 = (com.bxkj.student.run.app.utils.k) r3
            r1.add(r3)
            java.util.ArrayList<com.bxkj.student.run.app.utils.k> r3 = r2.d
            int r0 = r0 + (-1)
            java.lang.Object r0 = r3.get(r0)
            com.bxkj.student.run.app.utils.k r0 = (com.bxkj.student.run.app.utils.k) r0
            r1.add(r0)
            com.bxkj.student.run.app.utils.h$a r0 = new com.bxkj.student.run.app.utils.h$a
            r0.<init>(r9)
            java.util.Collections.sort(r1, r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r1 = r1.iterator()
        L48:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L5a
            java.lang.Object r3 = r1.next()
            com.bxkj.student.run.app.utils.k r3 = (com.bxkj.student.run.app.utils.k) r3
            com.amap.api.maps.model.LatLng r3 = r3.b
            r0.add(r3)
            goto L48
        L5a:
            return r0
    }
}

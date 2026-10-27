package com.bxkj.student.run.app.utils;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class z {
    final int a;
    private java.lang.Boolean b;
    private com.amap.api.trace.TraceLocation c;
    private com.amap.api.trace.TraceLocation d;
    private java.util.List<com.amap.api.trace.TraceLocation> e;
    private java.util.List<com.amap.api.trace.TraceLocation> f;
    private int g;

    public z() {
            r1 = this;
            r1.<init>()
            r0 = 20
            r1.a = r0
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r1.b = r0
            com.amap.api.trace.TraceLocation r0 = new com.amap.api.trace.TraceLocation
            r0.<init>()
            r1.c = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.e = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.f = r0
            r0 = 0
            r1.g = r0
            return
    }

    public java.lang.Boolean a(com.amap.api.trace.TraceLocation r19) {
            r18 = this;
            r0 = r18
            java.lang.Boolean r1 = r0.b
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L51
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            r0.b = r1
            com.amap.api.trace.TraceLocation r1 = r0.c
            double r2 = r19.getLatitude()
            r1.setLatitude(r2)
            com.amap.api.trace.TraceLocation r1 = r0.c
            double r2 = r19.getLongitude()
            r1.setLongitude(r2)
            com.amap.api.trace.TraceLocation r1 = r0.c
            long r2 = r19.getTime()
            r1.setTime(r2)
            com.amap.api.trace.TraceLocation r1 = new com.amap.api.trace.TraceLocation
            r1.<init>()
            double r2 = r19.getLatitude()
            r1.setLatitude(r2)
            double r2 = r19.getLongitude()
            r1.setLongitude(r2)
            long r2 = r19.getTime()
            r1.setTime(r2)
            java.util.List<com.amap.api.trace.TraceLocation> r2 = r0.e
            r2.add(r1)
            int r1 = r0.g
            int r1 = r1 + 1
            r0.g = r1
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            return r1
        L51:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = ""
            r1.append(r2)
            java.lang.String r2 = "非第一次 : "
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.amap.api.trace.TraceLocation r2 = r0.d
            java.lang.String r3 = " : "
            java.lang.String r4 = ",MaxDistance = "
            java.lang.String r5 = "distance = "
            r6 = 1000(0x3e8, double:4.94E-321)
            r10 = 4596373779694328218(0x3fc999999999999a, double:0.2)
            if (r2 != 0) goto L17f
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r1)
            java.lang.String r1 = "weight2=null : "
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            long r12 = r19.getTime()
            com.amap.api.trace.TraceLocation r2 = r0.c
            long r14 = r2.getTime()
            long r12 = r12 - r14
            long r12 = r12 / r6
            r6 = 20
            long r12 = r12 * r6
            com.amap.api.maps.model.LatLng r2 = new com.amap.api.maps.model.LatLng
            com.amap.api.trace.TraceLocation r6 = r0.c
            double r6 = r6.getLatitude()
            com.amap.api.trace.TraceLocation r14 = r0.c
            double r14 = r14.getLongitude()
            r2.<init>(r6, r14)
            com.amap.api.maps.model.LatLng r6 = new com.amap.api.maps.model.LatLng
            double r14 = r19.getLatitude()
            r16 = 4605380978949069210(0x3fe999999999999a, double:0.8)
            double r8 = r19.getLongitude()
            r6.<init>(r14, r8)
            float r2 = com.amap.api.maps.AMapUtils.calculateLineDistance(r2, r6)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r1)
            r6.append(r5)
            r6.append(r2)
            r6.append(r4)
            r6.append(r12)
            r6.append(r3)
            java.lang.String r1 = r6.toString()
            float r3 = (float) r12
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 <= 0) goto L107
            com.amap.api.trace.TraceLocation r1 = new com.amap.api.trace.TraceLocation
            r1.<init>()
            r0.d = r1
            double r2 = r19.getLatitude()
            r1.setLatitude(r2)
            com.amap.api.trace.TraceLocation r1 = r0.d
            double r2 = r19.getLongitude()
            r1.setLongitude(r2)
            com.amap.api.trace.TraceLocation r1 = r0.d
            long r2 = r19.getTime()
            r1.setTime(r2)
            java.util.List<com.amap.api.trace.TraceLocation> r1 = r0.f
            com.amap.api.trace.TraceLocation r2 = r0.d
            r1.add(r2)
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            return r1
        L107:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r1)
            java.lang.String r1 = "distance < MaxDistance当前点 距离小 : 添加到w1TempList"
            r2.append(r1)
            com.amap.api.trace.TraceLocation r1 = new com.amap.api.trace.TraceLocation
            r1.<init>()
            double r2 = r19.getLatitude()
            r1.setLatitude(r2)
            double r2 = r19.getLongitude()
            r1.setLongitude(r2)
            long r2 = r19.getTime()
            r1.setTime(r2)
            java.util.List<com.amap.api.trace.TraceLocation> r2 = r0.e
            r2.add(r1)
            int r1 = r0.g
            int r1 = r1 + 1
            r0.g = r1
            com.amap.api.trace.TraceLocation r1 = r0.c
            double r2 = r1.getLatitude()
            double r2 = r2 * r10
            double r4 = r19.getLatitude()
            double r4 = r4 * r16
            double r2 = r2 + r4
            r1.setLatitude(r2)
            com.amap.api.trace.TraceLocation r1 = r0.c
            double r2 = r1.getLongitude()
            double r2 = r2 * r10
            double r4 = r19.getLongitude()
            double r4 = r4 * r16
            double r2 = r2 + r4
            r1.setLongitude(r2)
            com.amap.api.trace.TraceLocation r1 = r0.c
            long r2 = r19.getTime()
            r1.setTime(r2)
            com.amap.api.trace.TraceLocation r1 = r0.c
            float r2 = r19.getSpeed()
            r1.setSpeed(r2)
            int r1 = r0.g
            r2 = 3
            if (r1 <= r2) goto L17c
            java.util.List<com.amap.api.trace.TraceLocation> r1 = r0.e
            r1.clear()
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            return r1
        L17c:
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            return r1
        L17f:
            r16 = 4605380978949069210(0x3fe999999999999a, double:0.8)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r1)
            java.lang.String r1 = "weight2 != null : "
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            long r8 = r19.getTime()
            com.amap.api.trace.TraceLocation r2 = r0.d
            long r12 = r2.getTime()
            long r8 = r8 - r12
            long r8 = r8 / r6
            r6 = 16
            long r8 = r8 * r6
            com.amap.api.maps.model.LatLng r2 = new com.amap.api.maps.model.LatLng
            com.amap.api.trace.TraceLocation r6 = r0.d
            double r6 = r6.getLatitude()
            com.amap.api.trace.TraceLocation r12 = r0.d
            double r12 = r12.getLongitude()
            r2.<init>(r6, r12)
            com.amap.api.maps.model.LatLng r6 = new com.amap.api.maps.model.LatLng
            double r12 = r19.getLatitude()
            double r14 = r19.getLongitude()
            r6.<init>(r12, r14)
            float r2 = com.amap.api.maps.AMapUtils.calculateLineDistance(r2, r6)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r1)
            r6.append(r5)
            r6.append(r2)
            r6.append(r4)
            r6.append(r8)
            r6.append(r3)
            java.lang.String r1 = r6.toString()
            float r3 = (float) r8
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 <= 0) goto L216
            java.util.List<com.amap.api.trace.TraceLocation> r1 = r0.f
            r1.clear()
            com.amap.api.trace.TraceLocation r1 = new com.amap.api.trace.TraceLocation
            r1.<init>()
            r0.d = r1
            double r2 = r19.getLatitude()
            r1.setLatitude(r2)
            com.amap.api.trace.TraceLocation r1 = r0.d
            double r2 = r19.getLongitude()
            r1.setLongitude(r2)
            com.amap.api.trace.TraceLocation r1 = r0.d
            long r2 = r19.getTime()
            r1.setTime(r2)
            java.util.List<com.amap.api.trace.TraceLocation> r1 = r0.f
            com.amap.api.trace.TraceLocation r2 = r0.d
            r1.add(r2)
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            return r1
        L216:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r1)
            java.lang.String r1 = "当前点 距离小: 添加到w2TempList"
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            com.amap.api.trace.TraceLocation r2 = new com.amap.api.trace.TraceLocation
            r2.<init>()
            double r3 = r19.getLatitude()
            r2.setLatitude(r3)
            double r3 = r19.getLongitude()
            r2.setLongitude(r3)
            long r3 = r19.getTime()
            r2.setTime(r3)
            java.util.List<com.amap.api.trace.TraceLocation> r3 = r0.f
            r3.add(r2)
            com.amap.api.trace.TraceLocation r2 = r0.d
            double r3 = r2.getLatitude()
            double r3 = r3 * r10
            double r5 = r19.getLatitude()
            double r5 = r5 * r16
            double r3 = r3 + r5
            r2.setLatitude(r3)
            com.amap.api.trace.TraceLocation r2 = r0.d
            double r3 = r2.getLongitude()
            double r3 = r3 * r10
            double r5 = r19.getLongitude()
            double r5 = r5 * r16
            double r3 = r3 + r5
            r2.setLongitude(r3)
            com.amap.api.trace.TraceLocation r2 = r0.d
            long r3 = r19.getTime()
            r2.setTime(r3)
            com.amap.api.trace.TraceLocation r2 = r0.d
            float r3 = r19.getSpeed()
            r2.setSpeed(r3)
            java.util.List<com.amap.api.trace.TraceLocation> r2 = r0.f
            int r2 = r2.size()
            r3 = 4
            if (r2 <= r3) goto L2b8
            int r2 = r0.g
            if (r2 <= r3) goto L297
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r1)
            java.lang.String r1 = "w1Count > 4计算增加W1"
            r2.append(r1)
            goto L2a9
        L297:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r1)
            java.lang.String r1 = "w1Count < 4计算丢弃W1"
            r2.append(r1)
            java.util.List<com.amap.api.trace.TraceLocation> r1 = r0.e
            r1.clear()
        L2a9:
            java.util.List<com.amap.api.trace.TraceLocation> r1 = r0.f
            r1.clear()
            com.amap.api.trace.TraceLocation r1 = r0.d
            r0.c = r1
            r1 = 0
            r0.d = r1
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            return r1
        L2b8:
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            return r1
    }
}

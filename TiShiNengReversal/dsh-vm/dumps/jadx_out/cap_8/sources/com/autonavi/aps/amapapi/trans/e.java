package com.autonavi.aps.amapapi.trans;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class e {
    private java.lang.StringBuilder a;

    /* renamed from: b, reason: collision with root package name */
    private com.amap.api.location.AMapLocationClientOption f5826b;

    public e() {
            r1 = this;
            r1.<init>()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1.a = r0
            com.amap.api.location.AMapLocationClientOption r0 = new com.amap.api.location.AMapLocationClientOption
            r0.<init>()
            r1.f5826b = r0
            return
    }

    private void a(com.autonavi.aps.amapapi.model.a r4, java.lang.String r5, java.lang.String r6, java.lang.String r7, java.lang.String r8, java.lang.String r9, java.lang.String r10, java.lang.String r11) {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            boolean r1 = android.text.TextUtils.isEmpty(r5)
            java.lang.String r2 = " "
            if (r1 != 0) goto L13
            r0.append(r5)
            r0.append(r2)
        L13:
            boolean r1 = android.text.TextUtils.isEmpty(r6)
            if (r1 != 0) goto L1c
            r3.a(r5, r6, r0)
        L1c:
            boolean r5 = android.text.TextUtils.isEmpty(r7)
            if (r5 != 0) goto L28
            r0.append(r7)
            r0.append(r2)
        L28:
            boolean r5 = android.text.TextUtils.isEmpty(r8)
            if (r5 != 0) goto L34
            r0.append(r8)
            r0.append(r2)
        L34:
            boolean r5 = android.text.TextUtils.isEmpty(r9)
            if (r5 != 0) goto L40
            r0.append(r9)
            r0.append(r2)
        L40:
            boolean r5 = android.text.TextUtils.isEmpty(r10)
            if (r5 != 0) goto L49
            r3.a(r11, r10, r0, r4)
        L49:
            android.os.Bundle r5 = new android.os.Bundle
            r5.<init>()
            java.lang.String r6 = "citycode"
            java.lang.String r7 = r4.getCityCode()
            r5.putString(r6, r7)
            java.lang.String r6 = "desc"
            java.lang.String r7 = r0.toString()
            r5.putString(r6, r7)
            java.lang.String r6 = "adcode"
            java.lang.String r7 = r4.getAdCode()
            r5.putString(r6, r7)
            r4.setExtras(r5)
            java.lang.String r5 = r0.toString()
            r4.g(r5)
            java.lang.String r5 = r4.getAdCode()
            if (r5 == 0) goto L9b
            java.lang.String r5 = r5.trim()
            int r5 = r5.length()
            if (r5 <= 0) goto L9b
            com.amap.api.location.AMapLocationClientOption r5 = r3.f5826b
            com.amap.api.location.AMapLocationClientOption$GeoLanguage r5 = r5.getGeoLanguage()
            com.amap.api.location.AMapLocationClientOption$GeoLanguage r6 = com.amap.api.location.AMapLocationClientOption.GeoLanguage.EN
            if (r5 == r6) goto L9b
            java.lang.String r5 = r0.toString()
            java.lang.String r6 = ""
            java.lang.String r5 = r5.replace(r2, r6)
            r4.setAddress(r5)
            return
        L9b:
            java.lang.String r5 = r0.toString()
            r4.setAddress(r5)
            return
    }

    private static void a(com.autonavi.aps.amapapi.model.a r2, short r3) {
            java.lang.String r0 = "-1"
            java.lang.String r1 = r2.d()
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L18
            r0 = -1
            if (r3 != r0) goto L11
            r3 = 0
            goto L14
        L11:
            if (r3 != 0) goto L14
            r3 = -1
        L14:
            r2.setConScenario(r3)
            return
        L18:
            r0 = 101(0x65, float:1.42E-43)
            if (r3 != r0) goto L1e
            r3 = 100
        L1e:
            r2.setConScenario(r3)
            return
    }

    private void a(java.lang.String r4, java.lang.String r5, java.lang.StringBuilder r6) {
            r3 = this;
            com.amap.api.location.AMapLocationClientOption r0 = r3.f5826b
            com.amap.api.location.AMapLocationClientOption$GeoLanguage r0 = r0.getGeoLanguage()
            com.amap.api.location.AMapLocationClientOption$GeoLanguage r1 = com.amap.api.location.AMapLocationClientOption.GeoLanguage.EN
            java.lang.String r2 = " "
            if (r0 != r1) goto L19
            boolean r4 = r5.equals(r4)
            if (r4 != 0) goto L28
            r6.append(r5)
            r6.append(r2)
            return
        L19:
            java.lang.String r0 = "市"
            boolean r0 = r4.contains(r0)
            if (r0 == 0) goto L29
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L28
            goto L29
        L28:
            return
        L29:
            r6.append(r5)
            r6.append(r2)
            return
    }

    private void a(java.lang.String r2, java.lang.String r3, java.lang.StringBuilder r4, com.autonavi.aps.amapapi.model.a r5) {
            r1 = this;
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 != 0) goto L34
            com.amap.api.location.AMapLocationClientOption r2 = r1.f5826b
            com.amap.api.location.AMapLocationClientOption$GeoLanguage r2 = r2.getGeoLanguage()
            com.amap.api.location.AMapLocationClientOption$GeoLanguage r0 = com.amap.api.location.AMapLocationClientOption.GeoLanguage.EN
            if (r2 == r0) goto L34
            java.lang.String r2 = "靠近"
            r4.append(r2)
            r4.append(r3)
            java.lang.String r2 = " "
            r4.append(r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r4 = "在"
            r2.<init>(r4)
            r2.append(r3)
            java.lang.String r3 = "附近"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r5.setDescription(r2)
            return
        L34:
            java.lang.String r2 = java.lang.String.valueOf(r3)
            java.lang.String r0 = "Near "
            java.lang.String r2 = r0.concat(r2)
            r4.append(r2)
            java.lang.String r2 = java.lang.String.valueOf(r3)
            java.lang.String r2 = r0.concat(r2)
            r5.setDescription(r2)
            return
    }

    private static java.lang.String b(java.lang.String r1) {
            java.lang.String r0 = "[]"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto La
            java.lang.String r1 = ""
        La:
            return r1
    }

    public final com.autonavi.aps.amapapi.model.a a(com.autonavi.aps.amapapi.model.a r17, byte[] r18, com.autonavi.aps.amapapi.a r19) {
            r16 = this;
            r1 = r16
            r2 = r17
            r10 = r19
            java.lang.String r11 = "#0505"
            r12 = 5
            r13 = 0
            java.lang.String r14 = ""
            if (r18 != 0) goto L34
            r2.setErrorCode(r12)     // Catch: java.lang.Throwable -> L30
            java.lang.String r0 = "#0504"
            r10.f(r0)     // Catch: java.lang.Throwable -> L30
            java.lang.StringBuilder r0 = r1.a     // Catch: java.lang.Throwable -> L30
            java.lang.String r3 = "binaryResult is null#0504"
            r0.append(r3)     // Catch: java.lang.Throwable -> L30
            java.lang.StringBuilder r0 = r1.a     // Catch: java.lang.Throwable -> L30
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L30
            r2.setLocationDetail(r0)     // Catch: java.lang.Throwable -> L30
            java.lang.StringBuilder r0 = r1.a     // Catch: java.lang.Throwable -> L30
            int r3 = r0.length()     // Catch: java.lang.Throwable -> L30
            r0.delete(r13, r3)     // Catch: java.lang.Throwable -> L30
            return r2
        L30:
            r0 = move-exception
            r3 = 0
            goto L22f
        L34:
            java.nio.ByteBuffer r3 = java.nio.ByteBuffer.wrap(r18)     // Catch: java.lang.Throwable -> L30
            byte r0 = r3.get()     // Catch: java.lang.Throwable -> L17c
            if (r0 != 0) goto L53
            short r0 = r3.getShort()     // Catch: java.lang.Throwable -> L50
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch: java.lang.Throwable -> L50
            r2.b(r0)     // Catch: java.lang.Throwable -> L50
            r3.clear()     // Catch: java.lang.Throwable -> L50
            r3.clear()
            return r2
        L50:
            r0 = move-exception
            goto L22f
        L53:
            int r0 = r3.getInt()     // Catch: java.lang.Throwable -> L17c
            double r4 = (double) r0     // Catch: java.lang.Throwable -> L17c
            r6 = 4696837146684686336(0x412e848000000000, double:1000000.0)
            double r4 = r4 / r6
            double r4 = com.autonavi.aps.amapapi.utils.j.a(r4)     // Catch: java.lang.Throwable -> L17c
            r2.setLongitude(r4)     // Catch: java.lang.Throwable -> L17c
            int r0 = r3.getInt()     // Catch: java.lang.Throwable -> L17c
            double r4 = (double) r0     // Catch: java.lang.Throwable -> L17c
            double r4 = r4 / r6
            double r4 = com.autonavi.aps.amapapi.utils.j.a(r4)     // Catch: java.lang.Throwable -> L17c
            r2.setLatitude(r4)     // Catch: java.lang.Throwable -> L17c
            short r0 = r3.getShort()     // Catch: java.lang.Throwable -> L17c
            float r0 = (float) r0     // Catch: java.lang.Throwable -> L17c
            r2.setAccuracy(r0)     // Catch: java.lang.Throwable -> L17c
            byte r0 = r3.get()     // Catch: java.lang.Throwable -> L17c
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch: java.lang.Throwable -> L17c
            r2.c(r0)     // Catch: java.lang.Throwable -> L17c
            byte r0 = r3.get()     // Catch: java.lang.Throwable -> L17c
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch: java.lang.Throwable -> L17c
            r2.d(r0)     // Catch: java.lang.Throwable -> L17c
            byte r0 = r3.get()     // Catch: java.lang.Throwable -> L17c
            r4 = 1
            java.lang.String r5 = "UTF-8"
            if (r0 != r4) goto L180
            byte r0 = r3.get()     // Catch: java.lang.Throwable -> L17c
            r0 = r0 & 255(0xff, float:3.57E-43)
            byte[] r0 = new byte[r0]     // Catch: java.lang.Throwable -> L17c
            r3.get(r0)     // Catch: java.lang.Throwable -> L17c
            java.lang.String r6 = new java.lang.String     // Catch: java.lang.Throwable -> Lac
            r6.<init>(r0, r5)     // Catch: java.lang.Throwable -> Lac
            r2.setCountry(r6)     // Catch: java.lang.Throwable -> Lac
        Lac:
            byte r0 = r3.get()     // Catch: java.lang.Throwable -> L17c
            r0 = r0 & 255(0xff, float:3.57E-43)
            byte[] r0 = new byte[r0]     // Catch: java.lang.Throwable -> L17c
            r3.get(r0)     // Catch: java.lang.Throwable -> L17c
            java.lang.String r6 = new java.lang.String     // Catch: java.lang.Throwable -> Lc0
            r6.<init>(r0, r5)     // Catch: java.lang.Throwable -> Lc0
            r2.setProvince(r6)     // Catch: java.lang.Throwable -> Lc1
            goto Lc1
        Lc0:
            r6 = r14
        Lc1:
            byte r0 = r3.get()     // Catch: java.lang.Throwable -> L17c
            r0 = r0 & 255(0xff, float:3.57E-43)
            byte[] r0 = new byte[r0]     // Catch: java.lang.Throwable -> L17c
            r3.get(r0)     // Catch: java.lang.Throwable -> L17c
            java.lang.String r7 = new java.lang.String     // Catch: java.lang.Throwable -> Ld5
            r7.<init>(r0, r5)     // Catch: java.lang.Throwable -> Ld5
            r2.setCity(r7)     // Catch: java.lang.Throwable -> Ld6
            goto Ld6
        Ld5:
            r7 = r14
        Ld6:
            byte r0 = r3.get()     // Catch: java.lang.Throwable -> L17c
            r0 = r0 & 255(0xff, float:3.57E-43)
            byte[] r0 = new byte[r0]     // Catch: java.lang.Throwable -> L17c
            r3.get(r0)     // Catch: java.lang.Throwable -> L17c
            java.lang.String r8 = new java.lang.String     // Catch: java.lang.Throwable -> Lea
            r8.<init>(r0, r5)     // Catch: java.lang.Throwable -> Lea
            r2.setDistrict(r8)     // Catch: java.lang.Throwable -> Leb
            goto Leb
        Lea:
            r8 = r14
        Leb:
            byte r0 = r3.get()     // Catch: java.lang.Throwable -> L17c
            r0 = r0 & 255(0xff, float:3.57E-43)
            byte[] r0 = new byte[r0]     // Catch: java.lang.Throwable -> L17c
            r3.get(r0)     // Catch: java.lang.Throwable -> L17c
            java.lang.String r9 = new java.lang.String     // Catch: java.lang.Throwable -> L102
            r9.<init>(r0, r5)     // Catch: java.lang.Throwable -> L102
            r2.setStreet(r9)     // Catch: java.lang.Throwable -> L103
            r2.setRoad(r9)     // Catch: java.lang.Throwable -> L103
            goto L103
        L102:
            r9 = r14
        L103:
            byte r0 = r3.get()     // Catch: java.lang.Throwable -> L17c
            r0 = r0 & 255(0xff, float:3.57E-43)
            byte[] r0 = new byte[r0]     // Catch: java.lang.Throwable -> L17c
            r3.get(r0)     // Catch: java.lang.Throwable -> L17c
            java.lang.String r4 = new java.lang.String     // Catch: java.lang.Throwable -> L117
            r4.<init>(r0, r5)     // Catch: java.lang.Throwable -> L117
            r2.setNumber(r4)     // Catch: java.lang.Throwable -> L118
            goto L118
        L117:
            r4 = r14
        L118:
            byte r0 = r3.get()     // Catch: java.lang.Throwable -> L17c
            r0 = r0 & 255(0xff, float:3.57E-43)
            byte[] r0 = new byte[r0]     // Catch: java.lang.Throwable -> L17c
            r3.get(r0)     // Catch: java.lang.Throwable -> L17c
            java.lang.String r15 = new java.lang.String     // Catch: java.lang.Throwable -> L12c
            r15.<init>(r0, r5)     // Catch: java.lang.Throwable -> L12c
            r2.setPoiName(r15)     // Catch: java.lang.Throwable -> L12d
            goto L12d
        L12c:
            r15 = r14
        L12d:
            byte r0 = r3.get()     // Catch: java.lang.Throwable -> L17c
            r0 = r0 & 255(0xff, float:3.57E-43)
            byte[] r0 = new byte[r0]     // Catch: java.lang.Throwable -> L17c
            r3.get(r0)     // Catch: java.lang.Throwable -> L17c
            java.lang.String r12 = new java.lang.String     // Catch: java.lang.Throwable -> L140
            r12.<init>(r0, r5)     // Catch: java.lang.Throwable -> L140
            r2.setAoiName(r12)     // Catch: java.lang.Throwable -> L140
        L140:
            byte r0 = r3.get()     // Catch: java.lang.Throwable -> L17c
            r0 = r0 & 255(0xff, float:3.57E-43)
            byte[] r0 = new byte[r0]     // Catch: java.lang.Throwable -> L17c
            r3.get(r0)     // Catch: java.lang.Throwable -> L17c
            java.lang.String r12 = new java.lang.String     // Catch: java.lang.Throwable -> L154
            r12.<init>(r0, r5)     // Catch: java.lang.Throwable -> L154
            r2.setAdCode(r12)     // Catch: java.lang.Throwable -> L155
            goto L155
        L154:
            r12 = r14
        L155:
            byte r0 = r3.get()     // Catch: java.lang.Throwable -> L17c
            r0 = r0 & 255(0xff, float:3.57E-43)
            byte[] r0 = new byte[r0]     // Catch: java.lang.Throwable -> L17c
            r3.get(r0)     // Catch: java.lang.Throwable -> L17c
            java.lang.String r13 = new java.lang.String     // Catch: java.lang.Throwable -> L168
            r13.<init>(r0, r5)     // Catch: java.lang.Throwable -> L168
            r2.setCityCode(r13)     // Catch: java.lang.Throwable -> L168
        L168:
            r0 = r12
            r12 = r3
            r3 = r6
            r6 = r9
            r9 = r0
            r0 = r7
            r7 = r4
            r4 = r0
            r13 = r5
            r5 = r8
            r8 = r15
            r0 = 1
            r1.a(r2, r3, r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L178
            goto L183
        L178:
            r0 = move-exception
            r3 = r12
            goto L22f
        L17c:
            r0 = move-exception
            r12 = r3
            goto L22f
        L180:
            r12 = r3
            r13 = r5
            r0 = 1
        L183:
            byte r3 = r12.get()     // Catch: java.lang.Throwable -> L178
            r3 = r3 & 255(0xff, float:3.57E-43)
            byte[] r3 = new byte[r3]     // Catch: java.lang.Throwable -> L178
            r12.get(r3)     // Catch: java.lang.Throwable -> L178
            byte r3 = r12.get()     // Catch: java.lang.Throwable -> L178
            if (r3 != r0) goto L19d
            r12.getInt()     // Catch: java.lang.Throwable -> L178
            r12.getInt()     // Catch: java.lang.Throwable -> L178
            r12.getShort()     // Catch: java.lang.Throwable -> L178
        L19d:
            byte r3 = r12.get()     // Catch: java.lang.Throwable -> L178
            if (r3 != r0) goto L1c9
            byte r3 = r12.get()     // Catch: java.lang.Throwable -> L178
            r3 = r3 & 255(0xff, float:3.57E-43)
            byte[] r3 = new byte[r3]     // Catch: java.lang.Throwable -> L178
            r12.get(r3)     // Catch: java.lang.Throwable -> L178
            java.lang.String r4 = new java.lang.String     // Catch: java.lang.Throwable -> L1b6
            r4.<init>(r3, r13)     // Catch: java.lang.Throwable -> L1b6
            r2.setBuildingId(r4)     // Catch: java.lang.Throwable -> L1b6
        L1b6:
            byte r3 = r12.get()     // Catch: java.lang.Throwable -> L178
            r3 = r3 & 255(0xff, float:3.57E-43)
            byte[] r3 = new byte[r3]     // Catch: java.lang.Throwable -> L178
            r12.get(r3)     // Catch: java.lang.Throwable -> L178
            java.lang.String r4 = new java.lang.String     // Catch: java.lang.Throwable -> L1c9
            r4.<init>(r3, r13)     // Catch: java.lang.Throwable -> L1c9
            r2.setFloor(r4)     // Catch: java.lang.Throwable -> L1c9
        L1c9:
            byte r3 = r12.get()     // Catch: java.lang.Throwable -> L178
            if (r3 != r0) goto L1d8
            r12.get()     // Catch: java.lang.Throwable -> L178
            r12.getInt()     // Catch: java.lang.Throwable -> L178
            r12.get()     // Catch: java.lang.Throwable -> L178
        L1d8:
            byte r3 = r12.get()     // Catch: java.lang.Throwable -> L178
            if (r3 != r0) goto L1e5
            long r3 = r12.getLong()     // Catch: java.lang.Throwable -> L178
            r2.setTime(r3)     // Catch: java.lang.Throwable -> L178
        L1e5:
            short r0 = r12.getShort()     // Catch: java.lang.Throwable -> L178
            if (r0 <= 0) goto L1ff
            byte[] r3 = new byte[r0]     // Catch: java.lang.Throwable -> L178
            r12.get(r3)     // Catch: java.lang.Throwable -> L178
            if (r0 <= 0) goto L1ff
            r4 = 0
            byte[] r0 = android.util.Base64.decode(r3, r4)     // Catch: java.lang.Throwable -> L1ff
            java.lang.String r3 = new java.lang.String     // Catch: java.lang.Throwable -> L1ff
            r3.<init>(r0, r13)     // Catch: java.lang.Throwable -> L1ff
            r2.a(r3)     // Catch: java.lang.Throwable -> L1ff
        L1ff:
            short r0 = r12.getShort()     // Catch: java.lang.Throwable -> L178
            if (r0 <= 0) goto L20a
            byte[] r0 = new byte[r0]     // Catch: java.lang.Throwable -> L178
            r12.get(r0)     // Catch: java.lang.Throwable -> L178
        L20a:
            java.lang.String r0 = com.autonavi.aps.amapapi.utils.b.a     // Catch: java.lang.Throwable -> L178
            java.lang.Double r0 = java.lang.Double.valueOf(r0)     // Catch: java.lang.Throwable -> L178
            double r3 = r0.doubleValue()     // Catch: java.lang.Throwable -> L178
            r5 = 4617428107952285286(0x4014666666666666, double:5.1)
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 < 0) goto L22b
            short r0 = r12.getShort()     // Catch: java.lang.Throwable -> L178
            a(r2, r0)     // Catch: java.lang.Throwable -> L178
            byte r0 = r12.get()     // Catch: java.lang.Throwable -> L178
            r2.a(r0)     // Catch: java.lang.Throwable -> L178
        L22b:
            r12.clear()
            goto L269
        L22f:
            com.autonavi.aps.amapapi.model.a r2 = new com.autonavi.aps.amapapi.model.a     // Catch: java.lang.Throwable -> L27c
            r2.<init>(r14)     // Catch: java.lang.Throwable -> L27c
            r4 = 5
            r2.setErrorCode(r4)     // Catch: java.lang.Throwable -> L27c
            r10.f(r11)     // Catch: java.lang.Throwable -> L27c
            java.lang.StringBuilder r4 = r1.a     // Catch: java.lang.Throwable -> L27c
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L27c
            java.lang.String r6 = "parser data error:"
            r5.<init>(r6)     // Catch: java.lang.Throwable -> L27c
            java.lang.String r0 = r0.getMessage()     // Catch: java.lang.Throwable -> L27c
            r5.append(r0)     // Catch: java.lang.Throwable -> L27c
            r5.append(r11)     // Catch: java.lang.Throwable -> L27c
            java.lang.String r0 = r5.toString()     // Catch: java.lang.Throwable -> L27c
            r4.append(r0)     // Catch: java.lang.Throwable -> L27c
            r0 = 2054(0x806, float:2.878E-42)
            r4 = 0
            com.autonavi.aps.amapapi.utils.h.a(r4, r0)     // Catch: java.lang.Throwable -> L27c
            java.lang.StringBuilder r0 = r1.a     // Catch: java.lang.Throwable -> L27c
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L27c
            r2.setLocationDetail(r0)     // Catch: java.lang.Throwable -> L27c
            if (r3 == 0) goto L269
            r3.clear()
        L269:
            java.lang.StringBuilder r0 = r1.a
            int r0 = r0.length()
            if (r0 <= 0) goto L27b
            java.lang.StringBuilder r0 = r1.a
            int r3 = r0.length()
            r4 = 0
            r0.delete(r4, r3)
        L27b:
            return r2
        L27c:
            r0 = move-exception
            if (r3 == 0) goto L282
            r3.clear()
        L282:
            throw r0
    }

    public final com.autonavi.aps.amapapi.model.a a(java.lang.String r13) {
            r12 = this;
            r0 = 0
            com.autonavi.aps.amapapi.model.a r2 = new com.autonavi.aps.amapapi.model.a     // Catch: java.lang.Throwable -> L105
            java.lang.String r1 = ""
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L105
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L105
            r1.<init>(r13)     // Catch: java.lang.Throwable -> L105
            java.lang.String r13 = "regeocode"
            org.json.JSONObject r13 = r1.optJSONObject(r13)     // Catch: java.lang.Throwable -> L105
            java.lang.String r1 = "addressComponent"
            org.json.JSONObject r1 = r13.optJSONObject(r1)     // Catch: java.lang.Throwable -> L105
            java.lang.String r3 = "country"
            java.lang.String r3 = r1.optString(r3)     // Catch: java.lang.Throwable -> L105
            java.lang.String r3 = b(r3)     // Catch: java.lang.Throwable -> L105
            r2.setCountry(r3)     // Catch: java.lang.Throwable -> L105
            java.lang.String r3 = "province"
            java.lang.String r3 = r1.optString(r3)     // Catch: java.lang.Throwable -> L105
            java.lang.String r3 = b(r3)     // Catch: java.lang.Throwable -> L105
            r2.setProvince(r3)     // Catch: java.lang.Throwable -> L105
            java.lang.String r4 = "citycode"
            java.lang.String r4 = r1.optString(r4)     // Catch: java.lang.Throwable -> L105
            java.lang.String r4 = b(r4)     // Catch: java.lang.Throwable -> L105
            r2.setCityCode(r4)     // Catch: java.lang.Throwable -> L105
            java.lang.String r5 = "city"
            java.lang.String r5 = r1.optString(r5)     // Catch: java.lang.Throwable -> L105
            java.lang.String r6 = "010"
            boolean r6 = r4.endsWith(r6)     // Catch: java.lang.Throwable -> L105
            if (r6 != 0) goto L6f
            java.lang.String r6 = "021"
            boolean r6 = r4.endsWith(r6)     // Catch: java.lang.Throwable -> L105
            if (r6 != 0) goto L6f
            java.lang.String r6 = "022"
            boolean r6 = r4.endsWith(r6)     // Catch: java.lang.Throwable -> L105
            if (r6 != 0) goto L6f
            java.lang.String r6 = "023"
            boolean r4 = r4.endsWith(r6)     // Catch: java.lang.Throwable -> L105
            if (r4 == 0) goto L67
            goto L6f
        L67:
            java.lang.String r5 = b(r5)     // Catch: java.lang.Throwable -> L105
            r2.setCity(r5)     // Catch: java.lang.Throwable -> L105
            goto L7b
        L6f:
            if (r3 == 0) goto L7b
            int r4 = r3.length()     // Catch: java.lang.Throwable -> L105
            if (r4 <= 0) goto L7b
            r2.setCity(r3)     // Catch: java.lang.Throwable -> L105
            r5 = r3
        L7b:
            boolean r4 = android.text.TextUtils.isEmpty(r5)     // Catch: java.lang.Throwable -> L105
            if (r4 == 0) goto L86
            r2.setCity(r3)     // Catch: java.lang.Throwable -> L105
            r4 = r3
            goto L87
        L86:
            r4 = r5
        L87:
            java.lang.String r5 = "district"
            java.lang.String r5 = r1.optString(r5)     // Catch: java.lang.Throwable -> L105
            java.lang.String r5 = b(r5)     // Catch: java.lang.Throwable -> L105
            r2.setDistrict(r5)     // Catch: java.lang.Throwable -> L105
            java.lang.String r6 = "adcode"
            java.lang.String r6 = r1.optString(r6)     // Catch: java.lang.Throwable -> L105
            java.lang.String r9 = b(r6)     // Catch: java.lang.Throwable -> L105
            r2.setAdCode(r9)     // Catch: java.lang.Throwable -> L105
            java.lang.String r6 = "streetNumber"
            org.json.JSONObject r1 = r1.optJSONObject(r6)     // Catch: java.lang.Throwable -> L105
            java.lang.String r6 = "street"
            java.lang.String r6 = r1.optString(r6)     // Catch: java.lang.Throwable -> L105
            java.lang.String r6 = b(r6)     // Catch: java.lang.Throwable -> L105
            r2.setStreet(r6)     // Catch: java.lang.Throwable -> L105
            r2.setRoad(r6)     // Catch: java.lang.Throwable -> L105
            java.lang.String r7 = "number"
            java.lang.String r1 = r1.optString(r7)     // Catch: java.lang.Throwable -> L105
            java.lang.String r7 = b(r1)     // Catch: java.lang.Throwable -> L105
            r2.setNumber(r7)     // Catch: java.lang.Throwable -> L105
            java.lang.String r1 = "pois"
            org.json.JSONArray r1 = r13.optJSONArray(r1)     // Catch: java.lang.Throwable -> L105
            int r8 = r1.length()     // Catch: java.lang.Throwable -> L105
            java.lang.String r10 = "name"
            r11 = 0
            if (r8 <= 0) goto Le4
            org.json.JSONObject r1 = r1.getJSONObject(r11)     // Catch: java.lang.Throwable -> L105
            java.lang.String r1 = r1.optString(r10)     // Catch: java.lang.Throwable -> L105
            java.lang.String r1 = b(r1)     // Catch: java.lang.Throwable -> L105
            r2.setPoiName(r1)     // Catch: java.lang.Throwable -> L105
            r8 = r1
            goto Le5
        Le4:
            r8 = r0
        Le5:
            java.lang.String r1 = "aois"
            org.json.JSONArray r13 = r13.optJSONArray(r1)     // Catch: java.lang.Throwable -> L105
            int r1 = r13.length()     // Catch: java.lang.Throwable -> L105
            if (r1 <= 0) goto L100
            org.json.JSONObject r13 = r13.getJSONObject(r11)     // Catch: java.lang.Throwable -> L105
            java.lang.String r13 = r13.optString(r10)     // Catch: java.lang.Throwable -> L105
            java.lang.String r13 = b(r13)     // Catch: java.lang.Throwable -> L105
            r2.setAoiName(r13)     // Catch: java.lang.Throwable -> L105
        L100:
            r1 = r12
            r1.a(r2, r3, r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L105
            return r2
        L105:
            return r0
    }

    public final com.autonavi.aps.amapapi.model.a a(java.lang.String r10, android.content.Context r11, com.amap.api.col.p0003l.a7 r12, com.autonavi.aps.amapapi.a r13) {
            r9 = this;
            java.lang.String r0 = "#0701"
            java.lang.String r1 = "#0702"
            java.lang.String r2 = "status"
            com.autonavi.aps.amapapi.model.a r3 = new com.autonavi.aps.amapapi.model.a
            java.lang.String r4 = ""
            r3.<init>(r4)
            r4 = 7
            r3.setErrorCode(r4)
            java.lang.StringBuffer r4 = new java.lang.StringBuffer
            r4.<init>()
            r5 = 0
            java.lang.String r6 = "#SHA1AndPackage#"
            r4.append(r6)     // Catch: java.lang.Throwable -> L56
            java.lang.String r11 = com.amap.api.col.p0003l.f4.i(r11)     // Catch: java.lang.Throwable -> L56
            r4.append(r11)     // Catch: java.lang.Throwable -> L56
            java.util.Map<java.lang.String, java.util.List<java.lang.String>> r11 = r12.f2960b     // Catch: java.lang.Throwable -> L56
            java.lang.String r6 = "gsid"
            java.lang.Object r11 = r11.get(r6)     // Catch: java.lang.Throwable -> L56
            java.util.List r11 = (java.util.List) r11     // Catch: java.lang.Throwable -> L56
            java.lang.Object r11 = r11.get(r5)     // Catch: java.lang.Throwable -> L56
            java.lang.String r11 = (java.lang.String) r11     // Catch: java.lang.Throwable -> L56
            boolean r6 = android.text.TextUtils.isEmpty(r11)     // Catch: java.lang.Throwable -> L56
            if (r6 != 0) goto L41
            java.lang.String r6 = "#gsid#"
            r4.append(r6)     // Catch: java.lang.Throwable -> L56
            r4.append(r11)     // Catch: java.lang.Throwable -> L56
        L41:
            java.lang.String r11 = r12.f2961c     // Catch: java.lang.Throwable -> L56
            boolean r6 = android.text.TextUtils.isEmpty(r11)     // Catch: java.lang.Throwable -> L56
            if (r6 != 0) goto L56
            java.lang.String r6 = "#csid#"
            java.lang.String r11 = java.lang.String.valueOf(r11)     // Catch: java.lang.Throwable -> L56
            java.lang.String r11 = r6.concat(r11)     // Catch: java.lang.Throwable -> L56
            r4.append(r11)     // Catch: java.lang.Throwable -> L56
        L56:
            org.json.JSONObject r11 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L6a
            r11.<init>(r10)     // Catch: java.lang.Throwable -> L6a
            boolean r6 = r11.has(r2)     // Catch: java.lang.Throwable -> L6a
            java.lang.String r7 = "info"
            if (r6 == 0) goto L6c
            boolean r6 = r11.has(r7)     // Catch: java.lang.Throwable -> L6a
            if (r6 != 0) goto L7f
            goto L6c
        L6a:
            r10 = move-exception
            goto Lae
        L6c:
            r13.f(r1)     // Catch: java.lang.Throwable -> L6a
            java.lang.StringBuilder r6 = r9.a     // Catch: java.lang.Throwable -> L6a
            java.lang.String r8 = "json is error:"
            r6.append(r8)     // Catch: java.lang.Throwable -> L6a
            r6.append(r10)     // Catch: java.lang.Throwable -> L6a
            r6.append(r4)     // Catch: java.lang.Throwable -> L6a
            r6.append(r1)     // Catch: java.lang.Throwable -> L6a
        L7f:
            java.lang.String r10 = r11.getString(r2)     // Catch: java.lang.Throwable -> L6a
            java.lang.String r1 = r11.getString(r7)     // Catch: java.lang.Throwable -> L6a
            java.lang.String r2 = "infocode"
            java.lang.String r11 = r11.getString(r2)     // Catch: java.lang.Throwable -> L6a
            java.lang.String r2 = "0"
            boolean r10 = r2.equals(r10)     // Catch: java.lang.Throwable -> L6a
            if (r10 == 0) goto Lce
            r13.f(r0)     // Catch: java.lang.Throwable -> L6a
            java.lang.StringBuilder r10 = r9.a     // Catch: java.lang.Throwable -> L6a
            java.lang.String r2 = "auth fail:"
            r10.append(r2)     // Catch: java.lang.Throwable -> L6a
            r10.append(r1)     // Catch: java.lang.Throwable -> L6a
            r10.append(r4)     // Catch: java.lang.Throwable -> L6a
            r10.append(r0)     // Catch: java.lang.Throwable -> L6a
            java.lang.String r10 = r12.f2962d     // Catch: java.lang.Throwable -> L6a
            com.autonavi.aps.amapapi.utils.h.a(r10, r11, r1)     // Catch: java.lang.Throwable -> L6a
            goto Lce
        Lae:
            java.lang.String r11 = "#0703"
            r13.f(r11)
            java.lang.StringBuilder r12 = r9.a
            java.lang.String r13 = "json exception error:"
            r12.append(r13)
            java.lang.String r13 = r10.getMessage()
            r12.append(r13)
            r12.append(r4)
            r12.append(r11)
            java.lang.String r11 = "parser"
            java.lang.String r12 = "paseAuthFailurJson"
            com.autonavi.aps.amapapi.utils.b.a(r10, r11, r12)
        Lce:
            java.lang.StringBuilder r10 = r9.a
            java.lang.String r10 = r10.toString()
            r3.setLocationDetail(r10)
            java.lang.StringBuilder r10 = r9.a
            int r10 = r10.length()
            if (r10 <= 0) goto Le8
            java.lang.StringBuilder r10 = r9.a
            int r11 = r10.length()
            r10.delete(r5, r11)
        Le8:
            return r3
    }

    public final void a(com.amap.api.location.AMapLocationClientOption r1) {
            r0 = this;
            if (r1 != 0) goto La
            com.amap.api.location.AMapLocationClientOption r1 = new com.amap.api.location.AMapLocationClientOption
            r1.<init>()
            r0.f5826b = r1
            return
        La:
            r0.f5826b = r1
            return
    }
}

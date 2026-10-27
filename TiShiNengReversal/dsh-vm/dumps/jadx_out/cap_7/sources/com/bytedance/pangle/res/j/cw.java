package com.bytedance.pangle.res.j;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
public class cw {


    public cw() {
            r0 = this;
            r0.<init>()
            return
    }

    private int j(java.nio.ByteBuffer r8) {
            r7 = this;
            int r0 = r8.capacity()
            r1 = -1
            r2 = 22
            if (r0 >= r2) goto La
            return r1
        La:
            int r0 = r0 - r2
            r2 = 65535(0xffff, float:9.1834E-41)
            int r2 = java.lang.Math.min(r0, r2)
            r3 = 0
        L13:
            if (r3 >= r2) goto L2c
            int r4 = r0 - r3
            int r5 = r8.getInt(r4)
            r6 = 101010256(0x6054b50, float:2.506985E-35)
            if (r5 != r6) goto L29
            int r5 = r4 + 20
            short r5 = r8.getShort(r5)
            if (r5 != r3) goto L29
            return r4
        L29:
            int r3 = r3 + 1
            goto L13
        L2c:
            return r1
    }

    private static com.bytedance.pangle.util.up<java.lang.Integer, byte[]> j(java.nio.MappedByteBuffer r3, int r4, java.lang.String r5) {
            int r0 = r3.getInt(r4)
            r1 = 67324752(0x4034b50, float:1.5433558E-36)
            if (r0 != r1) goto L63
            int r0 = r4 + 18
            int r0 = r3.getInt(r0)
            int r1 = r4 + 22
            int r1 = r3.getInt(r1)
            if (r0 != r1) goto L41
            byte[] r5 = new byte[r1]
            int r0 = r4 + 26
            short r0 = r3.getShort(r0)
            int r2 = r4 + 28
            short r2 = r3.getShort(r2)
            int r4 = r4 + 30
            int r4 = r4 + r0
            int r4 = r4 + r2
            r0 = 0
        L2a:
            if (r0 >= r1) goto L37
            int r2 = r4 + r0
            byte r2 = r3.get(r2)
            r5[r0] = r2
            int r0 = r0 + 1
            goto L2a
        L37:
            com.bytedance.pangle.util.up r3 = new com.bytedance.pangle.util.up
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r3.<init>(r4, r5)
            return r3
        L41:
            java.lang.RuntimeException r3 = new java.lang.RuntimeException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r5)
            java.lang.String r5 = " is compressed. compressSize:"
            r4.append(r5)
            r4.append(r0)
            java.lang.String r5 = " size:"
            r4.append(r5)
            r4.append(r1)
            java.lang.String r4 = r4.toString()
            r3.<init>(r4)
            throw r3
        L63:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Expected: 0x04034b50, got: "
            r1.<init>(r2)
            int r3 = r3.getInt(r4)
            r1.append(r3)
            java.lang.String r3 = " FileName:"
            r1.append(r3)
            r1.append(r5)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
    }

    private void j(java.io.File r10, java.util.HashSet<java.lang.String> r11, com.bytedance.pangle.res.j.tl r12) throws java.lang.Throwable {
            r9 = this;
            java.nio.MappedByteBuffer r10 = r9.j(r10)
            int r0 = r9.j(r10)
            r1 = -1
            if (r0 == r1) goto Lc4
            int r1 = r0 + 12
            int r1 = r10.getInt(r1)
            int r0 = r0 + 16
            int r0 = r10.getInt(r0)
            int r1 = r1 + r0
        L18:
            if (r0 >= r1) goto Lc3
            int r2 = r10.getInt(r0)
            r3 = 33639248(0x2014b50, float:9.499037E-38)
            if (r2 != r3) goto Lab
            int r2 = r0 + 28
            short r2 = r10.getShort(r2)
            int r3 = r0 + 30
            short r3 = r10.getShort(r3)
            byte[] r4 = new byte[r2]
            r5 = 0
            r6 = 0
        L33:
            if (r6 >= r2) goto L41
            int r7 = r0 + 46
            int r7 = r7 + r6
            byte r7 = r10.get(r7)
            r4[r6] = r7
            int r6 = r6 + 1
            goto L33
        L41:
            java.lang.String r6 = new java.lang.String
            r6.<init>(r4)
            int r4 = r0 + 20
            int r4 = r10.getInt(r4)
            int r7 = r0 + 24
            int r7 = r10.getInt(r7)
            boolean r8 = r11.contains(r6)
            if (r8 == 0) goto La5
            if (r4 != r7) goto L8e
            int r4 = r0 + 42
            int r4 = r10.getInt(r4)
            com.bytedance.pangle.util.up r4 = j(r10, r4, r6)
            U r7 = r4.xt     // Catch: java.lang.Throwable -> L87
            byte[] r7 = (byte[]) r7     // Catch: java.lang.Throwable -> L87
            com.bytedance.pangle.res.j.qv.j(r6, r7, r12)     // Catch: java.lang.Throwable -> L87
        L6b:
            U r6 = r4.xt
            byte[] r6 = (byte[]) r6
            int r6 = r6.length
            if (r5 >= r6) goto La5
            T r6 = r4.j
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            int r6 = r6 + r5
            U r7 = r4.xt
            byte[] r7 = (byte[]) r7
            r7 = r7[r5]
            r10.put(r6, r7)
            int r5 = r5 + 1
            goto L6b
        L87:
            r10 = move-exception
            java.lang.RuntimeException r11 = new java.lang.RuntimeException
            r11.<init>(r10)
            throw r11
        L8e:
            java.lang.Throwable r10 = new java.lang.Throwable
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r11.append(r6)
            java.lang.String r12 = " is compressed."
            r11.append(r12)
            java.lang.String r11 = r11.toString()
            r10.<init>(r11)
            throw r10
        La5:
            int r2 = r2 + 46
            int r2 = r2 + r3
            int r0 = r0 + r2
            goto L18
        Lab:
            java.lang.RuntimeException r11 = new java.lang.RuntimeException
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            java.lang.String r1 = "Expected: 0x02014b50, got: "
            r12.<init>(r1)
            int r10 = r10.getInt(r0)
            r12.append(r10)
            java.lang.String r10 = r12.toString()
            r11.<init>(r10)
            throw r11
        Lc3:
            return
        Lc4:
            java.lang.Throwable r10 = new java.lang.Throwable
            java.lang.String r11 = "endOfCentralPosition == -1"
            r10.<init>(r11)
            throw r10
    }

    public int j(java.io.File r20, boolean r21, java.lang.StringBuilder r22) {
            r19 = this;
            r0 = r20
            r1 = r21
            r2 = r22
            java.lang.String r3 = "modifyRes failed. catch: "
            java.lang.String r4 = "writeText failed."
            java.lang.String r5 = "resMapping"
            java.lang.String r6 = "resMappingBakFile is not exists. "
            java.lang.String r7 = "Zeus/install_pangle"
            r8 = 300(0x12c, float:4.2E-43)
            r9 = 0
            java.util.zip.ZipFile r10 = new java.util.zip.ZipFile     // Catch: java.lang.Throwable -> L12b
            r10.<init>(r0)     // Catch: java.lang.Throwable -> L12b
            java.lang.String r9 = "assets/ZeusResMapping"
            java.util.zip.ZipEntry r9 = r10.getEntry(r9)     // Catch: java.lang.Throwable -> L3e
            if (r9 != 0) goto L26
            com.bytedance.pangle.util.ae.j(r10)
            r0 = 200(0xc8, float:2.8E-43)
            return r0
        L26:
            java.lang.String r11 = "resMappingBak"
            if (r1 == 0) goto L65
            java.io.File r9 = new java.io.File     // Catch: java.lang.Throwable -> L3e
            java.io.File r12 = r0.getParentFile()     // Catch: java.lang.Throwable -> L3e
            r9.<init>(r12, r11)     // Catch: java.lang.Throwable -> L3e
            boolean r12 = r9.exists()     // Catch: java.lang.Throwable -> L3e
            if (r12 == 0) goto L44
            java.lang.String r6 = com.bytedance.pangle.util.tl.j(r9)     // Catch: java.lang.Throwable -> L3e
            goto L75
        L3e:
            r0 = move-exception
            r13 = r19
        L41:
            r9 = r10
            goto L12e
        L44:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L3e
            r0.<init>(r6)     // Catch: java.lang.Throwable -> L3e
            java.lang.String r1 = r9.getAbsolutePath()     // Catch: java.lang.Throwable -> L3e
            r0.append(r1)     // Catch: java.lang.Throwable -> L3e
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L3e
            com.bytedance.pangle.log.ZeusLogger.errReport(r7, r0)     // Catch: java.lang.Throwable -> L3e
            r2.append(r6)     // Catch: java.lang.Throwable -> L3e
            java.lang.String r0 = r9.getAbsolutePath()     // Catch: java.lang.Throwable -> L3e
            r2.append(r0)     // Catch: java.lang.Throwable -> L3e
            com.bytedance.pangle.util.ae.j(r10)
            return r8
        L65:
            java.io.ByteArrayOutputStream r6 = new java.io.ByteArrayOutputStream     // Catch: java.lang.Throwable -> L3e
            r6.<init>()     // Catch: java.lang.Throwable -> L3e
            java.io.InputStream r9 = r10.getInputStream(r9)     // Catch: java.lang.Throwable -> L3e
            com.bytedance.pangle.util.tl.j(r9, r6)     // Catch: java.lang.Throwable -> L3e
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> L3e
        L75:
            boolean r9 = android.text.TextUtils.isEmpty(r6)     // Catch: java.lang.Throwable -> L3e
            if (r9 == 0) goto L94
            java.lang.String r0 = "zeusResMappingContent empty, useBakFile:"
            java.lang.String r4 = java.lang.String.valueOf(r1)     // Catch: java.lang.Throwable -> L3e
            java.lang.String r0 = r0.concat(r4)     // Catch: java.lang.Throwable -> L3e
            com.bytedance.pangle.log.ZeusLogger.errReport(r7, r0)     // Catch: java.lang.Throwable -> L3e
            java.lang.String r0 = "zeusResMappingContent isEmpty. useBakFile:"
            r2.append(r0)     // Catch: java.lang.Throwable -> L3e
            r2.append(r1)     // Catch: java.lang.Throwable -> L3e
            com.bytedance.pangle.util.ae.j(r10)
            return r8
        L94:
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L3e
            r1.<init>(r6)     // Catch: java.lang.Throwable -> L3e
            org.json.JSONObject r9 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L3e
            r9.<init>(r6)     // Catch: java.lang.Throwable -> L3e
            java.lang.String r6 = "fileNames"
            java.lang.Object r6 = r1.get(r6)     // Catch: java.lang.Throwable -> L3e
            org.json.JSONArray r6 = (org.json.JSONArray) r6     // Catch: java.lang.Throwable -> L3e
            java.util.HashSet r12 = new java.util.HashSet     // Catch: java.lang.Throwable -> L3e
            r12.<init>()     // Catch: java.lang.Throwable -> L3e
            r18 = 0
            r13 = 0
        Lae:
            int r14 = r6.length()     // Catch: java.lang.Throwable -> L3e
            if (r13 >= r14) goto Lc0
            java.lang.Object r14 = r6.get(r13)     // Catch: java.lang.Throwable -> L3e
            java.lang.String r14 = (java.lang.String) r14     // Catch: java.lang.Throwable -> L3e
            r12.add(r14)     // Catch: java.lang.Throwable -> L3e
            int r13 = r13 + 1
            goto Lae
        Lc0:
            java.lang.Object r1 = r1.get(r5)     // Catch: java.lang.Throwable -> L3e
            r14 = r1
            org.json.JSONObject r14 = (org.json.JSONObject) r14     // Catch: java.lang.Throwable -> L3e
            java.lang.Object r1 = r9.get(r5)     // Catch: java.lang.Throwable -> L3e
            r15 = r1
            org.json.JSONObject r15 = (org.json.JSONObject) r15     // Catch: java.lang.Throwable -> L3e
            int[] r16 = new int[]{r18}     // Catch: java.lang.Throwable -> L3e
            r17 = r12
            com.bytedance.pangle.res.j.cw$1 r12 = new com.bytedance.pangle.res.j.cw$1     // Catch: java.lang.Throwable -> L3e
            r13 = r19
            r12.<init>(r13, r14, r15, r16, r17)     // Catch: java.lang.Throwable -> L128
            r1 = r17
            r13 = r19
            r13.j(r0, r1, r12)     // Catch: java.lang.Throwable -> L128
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L128
            java.lang.String r5 = "modifyRes count = "
            r1.<init>(r5)     // Catch: java.lang.Throwable -> L128
            r5 = r16[r18]     // Catch: java.lang.Throwable -> L128
            r1.append(r5)     // Catch: java.lang.Throwable -> L128
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L128
            com.bytedance.pangle.log.ZeusLogger.d(r7, r1)     // Catch: java.lang.Throwable -> L128
            java.lang.String r1 = r9.toString()     // Catch: java.lang.Throwable -> L128
            java.io.File r5 = new java.io.File     // Catch: java.lang.Throwable -> L128
            java.io.File r0 = r0.getParentFile()     // Catch: java.lang.Throwable -> L128
            r5.<init>(r0, r11)     // Catch: java.lang.Throwable -> L128
            boolean r0 = com.bytedance.pangle.util.tl.j(r1, r5, r2)     // Catch: java.lang.Throwable -> L128
            if (r0 == 0) goto L10e
            com.bytedance.pangle.util.ae.j(r10)
            r0 = 100
            return r0
        L10e:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L128
            r0.<init>(r4)     // Catch: java.lang.Throwable -> L128
            java.lang.String r1 = r2.toString()     // Catch: java.lang.Throwable -> L128
            r0.append(r1)     // Catch: java.lang.Throwable -> L128
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L128
            com.bytedance.pangle.log.ZeusLogger.errReport(r7, r0)     // Catch: java.lang.Throwable -> L128
            r2.append(r4)     // Catch: java.lang.Throwable -> L128
            com.bytedance.pangle.util.ae.j(r10)
            return r8
        L128:
            r0 = move-exception
            goto L41
        L12b:
            r0 = move-exception
            r13 = r19
        L12e:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L151
            r1.<init>(r3)     // Catch: java.lang.Throwable -> L151
            java.lang.String r4 = r0.getMessage()     // Catch: java.lang.Throwable -> L151
            r1.append(r4)     // Catch: java.lang.Throwable -> L151
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L151
            com.bytedance.pangle.log.ZeusLogger.errReport(r7, r1, r0)     // Catch: java.lang.Throwable -> L151
            r2.append(r3)     // Catch: java.lang.Throwable -> L151
            java.lang.String r0 = r0.getMessage()     // Catch: java.lang.Throwable -> L151
            r2.append(r0)     // Catch: java.lang.Throwable -> L151
            if (r9 == 0) goto L150
            com.bytedance.pangle.util.ae.j(r9)
        L150:
            return r8
        L151:
            r0 = move-exception
            if (r9 == 0) goto L157
            com.bytedance.pangle.util.ae.j(r9)
        L157:
            throw r0
    }

    public java.nio.MappedByteBuffer j(java.io.File r10) throws java.io.IOException {
            r9 = this;
            r1 = 0
            java.lang.String r0 = "temp-pxr"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L23
            java.lang.String r3 = "mappedByteBuffer "
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L23
            boolean r3 = r10.canWrite()     // Catch: java.lang.Throwable -> L23
            r2.append(r3)     // Catch: java.lang.Throwable -> L23
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L23
            com.bytedance.pangle.log.ZeusLogger.d(r0, r2)     // Catch: java.lang.Throwable -> L23
            boolean r0 = r10.canWrite()     // Catch: java.lang.Throwable -> L23
            if (r0 != 0) goto L26
            r0 = 1
            r10.setWritable(r0)     // Catch: java.lang.Throwable -> L23
            goto L26
        L23:
            r0 = move-exception
            r10 = r0
            goto L68
        L26:
            java.io.RandomAccessFile r2 = new java.io.RandomAccessFile     // Catch: java.lang.Throwable -> L23
            java.lang.String r0 = "rw"
            r2.<init>(r10, r0)     // Catch: java.lang.Throwable -> L23
            java.nio.channels.FileChannel r3 = r2.getChannel()     // Catch: java.lang.Throwable -> L54
            long r7 = r3.size()     // Catch: java.lang.Throwable -> L54
            java.nio.channels.FileChannel$MapMode r4 = java.nio.channels.FileChannel.MapMode.READ_WRITE     // Catch: java.lang.Throwable -> L54
            r5 = 0
            java.nio.MappedByteBuffer r10 = r3.map(r4, r5, r7)     // Catch: java.lang.Throwable -> L54
            r0 = 4194304(0x400000, float:5.877472E-39)
            byte[] r0 = new byte[r0]     // Catch: java.lang.Throwable -> L54
            r3 = 4194304(0x400000, double:2.0722615E-317)
            long r5 = r7 / r3
            long r7 = r7 % r3
            int r1 = (int) r7     // Catch: java.lang.Throwable -> L54
            r3 = 0
        L49:
            long r7 = (long) r3     // Catch: java.lang.Throwable -> L54
            int r4 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r4 >= 0) goto L58
            r10.get(r0)     // Catch: java.lang.Throwable -> L54
            int r3 = r3 + 1
            goto L49
        L54:
            r0 = move-exception
            r10 = r0
            r1 = r2
            goto L68
        L58:
            if (r1 <= 0) goto L5f
            byte[] r0 = new byte[r1]     // Catch: java.lang.Throwable -> L54
            r10.get(r0)     // Catch: java.lang.Throwable -> L54
        L5f:
            java.nio.ByteOrder r0 = java.nio.ByteOrder.LITTLE_ENDIAN     // Catch: java.lang.Throwable -> L54
            r10.order(r0)     // Catch: java.lang.Throwable -> L54
            r2.close()
            return r10
        L68:
            if (r1 == 0) goto L6d
            r1.close()
        L6d:
            throw r10
    }
}

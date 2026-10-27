package com.kuaishou.weapon.p0;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class br {
    public static final java.lang.String a = "7";
    public static final java.lang.String b = "6";
    public static final java.lang.String c = "5";
    public static final java.lang.String d = "4";
    public static final java.lang.String e = "3";
    public static final java.lang.String f = "2";
    public static final java.lang.String g = "1";

    public br() {
            r0 = this;
            r0.<init>()
            return
    }

    public static org.json.JSONArray a(android.content.Context r19) {
            org.json.JSONArray r0 = new org.json.JSONArray
            r0.<init>()
            java.util.zip.CRC32 r2 = new java.util.zip.CRC32     // Catch: java.lang.Throwable -> L27a java.lang.Exception -> L290
            r2.<init>()     // Catch: java.lang.Throwable -> L27a java.lang.Exception -> L290
            android.content.ContentResolver r3 = r19.getContentResolver()     // Catch: java.lang.Throwable -> L27a java.lang.Exception -> L290
            android.content.Context r4 = r19.getApplicationContext()     // Catch: java.lang.Throwable -> L27a java.lang.Exception -> L290
            android.content.Context r4 = com.stub.StubApp.getOrigApplicationContext(r4)     // Catch: java.lang.Throwable -> L27a java.lang.Exception -> L290
            r5 = 1
            android.net.Uri r4 = android.media.RingtoneManager.getActualDefaultRingtoneUri(r4, r5)     // Catch: java.lang.Throwable -> L27a java.lang.Exception -> L290
            r7 = 0
            r8 = 0
            r5 = 0
            r6 = 0
            android.database.Cursor r4 = r3.query(r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L27a java.lang.Exception -> L290
            boolean r5 = r4.moveToNext()     // Catch: java.lang.Throwable -> L7a java.lang.Exception -> L292
            java.lang.String r9 = "0"
            java.lang.String r10 = "date_modified"
            java.lang.String r11 = "3"
            java.lang.String r12 = "date_added"
            java.lang.String r13 = "4"
            java.lang.String r14 = "5"
            java.lang.String r15 = "_data"
            java.lang.String r6 = "2"
            java.lang.String r7 = "1"
            if (r5 == 0) goto L7e
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L7a java.lang.Exception -> L143
            r5.<init>()     // Catch: java.lang.Throwable -> L7a java.lang.Exception -> L143
            int r8 = r4.getColumnIndexOrThrow(r15)     // Catch: java.lang.Throwable -> L7a java.lang.Exception -> L143
            java.lang.String r8 = r4.getString(r8)     // Catch: java.lang.Throwable -> L7a java.lang.Exception -> L143
            byte[] r8 = r8.getBytes()     // Catch: java.lang.Throwable -> L7a java.lang.Exception -> L143
            r2.update(r8)     // Catch: java.lang.Throwable -> L7a java.lang.Exception -> L143
            long r16 = r2.getValue()     // Catch: java.lang.Throwable -> L7a java.lang.Exception -> L143
            java.lang.String r8 = java.lang.Long.toHexString(r16)     // Catch: java.lang.Throwable -> L7a java.lang.Exception -> L143
            r5.put(r14, r8)     // Catch: java.lang.Throwable -> L7a java.lang.Exception -> L143
            int r8 = r4.getColumnIndexOrThrow(r12)     // Catch: java.lang.Throwable -> L7a java.lang.Exception -> L143
            int r8 = r4.getInt(r8)     // Catch: java.lang.Throwable -> L7a java.lang.Exception -> L143
            r5.put(r13, r8)     // Catch: java.lang.Throwable -> L7a java.lang.Exception -> L143
            int r8 = r4.getColumnIndexOrThrow(r10)     // Catch: java.lang.Throwable -> L7a java.lang.Exception -> L143
            int r8 = r4.getInt(r8)     // Catch: java.lang.Throwable -> L7a java.lang.Exception -> L143
            r5.put(r11, r8)     // Catch: java.lang.Throwable -> L7a java.lang.Exception -> L143
            r5.put(r6, r7)     // Catch: java.lang.Throwable -> L7a java.lang.Exception -> L143
            r5.put(r7, r9)     // Catch: java.lang.Throwable -> L7a java.lang.Exception -> L143
            r0.put(r5)     // Catch: java.lang.Throwable -> L7a java.lang.Exception -> L143
            goto L7e
        L7a:
            r0 = move-exception
            r1 = r4
            goto L296
        L7e:
            r4.close()     // Catch: java.lang.Throwable -> L7a java.lang.Exception -> L292
            android.content.Context r4 = r19.getApplicationContext()     // Catch: java.lang.Throwable -> L27a java.lang.Exception -> L290
            android.content.Context r4 = com.stub.StubApp.getOrigApplicationContext(r4)     // Catch: java.lang.Throwable -> L27a java.lang.Exception -> L290
            r5 = 2
            android.net.Uri r4 = android.media.RingtoneManager.getActualDefaultRingtoneUri(r4, r5)     // Catch: java.lang.Throwable -> L27a java.lang.Exception -> L290
            r5 = r7
            r7 = 0
            r8 = 0
            r16 = r5
            r5 = 0
            r17 = r6
            r6 = 0
            r1 = r16
            r16 = r9
            r9 = r1
            r1 = r17
            android.database.Cursor r4 = r3.query(r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L27a java.lang.Exception -> L290
            boolean r5 = r4.moveToNext()     // Catch: java.lang.Throwable -> L7a java.lang.Exception -> L292
            if (r5 == 0) goto Le6
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L7a java.lang.Exception -> L143
            r5.<init>()     // Catch: java.lang.Throwable -> L7a java.lang.Exception -> L143
            int r6 = r4.getColumnIndexOrThrow(r15)     // Catch: java.lang.Throwable -> L7a java.lang.Exception -> L143
            java.lang.String r6 = r4.getString(r6)     // Catch: java.lang.Throwable -> L7a java.lang.Exception -> L143
            byte[] r6 = r6.getBytes()     // Catch: java.lang.Throwable -> L7a java.lang.Exception -> L143
            r2.update(r6)     // Catch: java.lang.Throwable -> L7a java.lang.Exception -> L143
            long r6 = r2.getValue()     // Catch: java.lang.Throwable -> L7a java.lang.Exception -> L143
            java.lang.String r6 = java.lang.Long.toHexString(r6)     // Catch: java.lang.Throwable -> L7a java.lang.Exception -> L143
            r5.put(r14, r6)     // Catch: java.lang.Throwable -> L7a java.lang.Exception -> L143
            int r6 = r4.getColumnIndexOrThrow(r12)     // Catch: java.lang.Throwable -> L7a java.lang.Exception -> L143
            int r6 = r4.getInt(r6)     // Catch: java.lang.Throwable -> L7a java.lang.Exception -> L143
            r5.put(r13, r6)     // Catch: java.lang.Throwable -> L7a java.lang.Exception -> L143
            int r6 = r4.getColumnIndexOrThrow(r10)     // Catch: java.lang.Throwable -> L7a java.lang.Exception -> L143
            int r6 = r4.getInt(r6)     // Catch: java.lang.Throwable -> L7a java.lang.Exception -> L143
            r5.put(r11, r6)     // Catch: java.lang.Throwable -> L7a java.lang.Exception -> L143
            r5.put(r1, r9)     // Catch: java.lang.Throwable -> L7a java.lang.Exception -> L143
            r5.put(r9, r9)     // Catch: java.lang.Throwable -> L7a java.lang.Exception -> L143
            r0.put(r5)     // Catch: java.lang.Throwable -> L7a java.lang.Exception -> L143
        Le6:
            r4.close()     // Catch: java.lang.Throwable -> L7a java.lang.Exception -> L292
            android.content.Context r4 = r19.getApplicationContext()     // Catch: java.lang.Throwable -> L27a java.lang.Exception -> L290
            android.content.Context r4 = com.stub.StubApp.getOrigApplicationContext(r4)     // Catch: java.lang.Throwable -> L27a java.lang.Exception -> L290
            r5 = 4
            android.net.Uri r4 = android.media.RingtoneManager.getActualDefaultRingtoneUri(r4, r5)     // Catch: java.lang.Throwable -> L27a java.lang.Exception -> L290
            r7 = 0
            r8 = 0
            r5 = 0
            r6 = 0
            android.database.Cursor r4 = r3.query(r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L27a java.lang.Exception -> L290
            boolean r5 = r4.moveToNext()     // Catch: java.lang.Throwable -> L7a java.lang.Exception -> L292
            if (r5 == 0) goto L147
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L7a java.lang.Exception -> L143
            r5.<init>()     // Catch: java.lang.Throwable -> L7a java.lang.Exception -> L143
            int r6 = r4.getColumnIndexOrThrow(r15)     // Catch: java.lang.Throwable -> L7a java.lang.Exception -> L143
            java.lang.String r6 = r4.getString(r6)     // Catch: java.lang.Throwable -> L7a java.lang.Exception -> L143
            byte[] r6 = r6.getBytes()     // Catch: java.lang.Throwable -> L7a java.lang.Exception -> L143
            r2.update(r6)     // Catch: java.lang.Throwable -> L7a java.lang.Exception -> L143
            long r6 = r2.getValue()     // Catch: java.lang.Throwable -> L7a java.lang.Exception -> L143
            java.lang.String r6 = java.lang.Long.toHexString(r6)     // Catch: java.lang.Throwable -> L7a java.lang.Exception -> L143
            r5.put(r14, r6)     // Catch: java.lang.Throwable -> L7a java.lang.Exception -> L143
            int r6 = r4.getColumnIndexOrThrow(r12)     // Catch: java.lang.Throwable -> L7a java.lang.Exception -> L143
            int r6 = r4.getInt(r6)     // Catch: java.lang.Throwable -> L7a java.lang.Exception -> L143
            r5.put(r13, r6)     // Catch: java.lang.Throwable -> L7a java.lang.Exception -> L143
            int r6 = r4.getColumnIndexOrThrow(r10)     // Catch: java.lang.Throwable -> L7a java.lang.Exception -> L143
            int r6 = r4.getInt(r6)     // Catch: java.lang.Throwable -> L7a java.lang.Exception -> L143
            r5.put(r11, r6)     // Catch: java.lang.Throwable -> L7a java.lang.Exception -> L143
            r5.put(r1, r9)     // Catch: java.lang.Throwable -> L7a java.lang.Exception -> L143
            r5.put(r9, r1)     // Catch: java.lang.Throwable -> L7a java.lang.Exception -> L143
            r0.put(r5)     // Catch: java.lang.Throwable -> L7a java.lang.Exception -> L143
            goto L147
        L143:
            r7 = r0
            goto L294
        L147:
            r4.close()     // Catch: java.lang.Throwable -> L7a java.lang.Exception -> L292
            android.net.Uri r4 = android.provider.MediaStore.Audio.Media.INTERNAL_CONTENT_URI     // Catch: java.lang.Throwable -> L27a java.lang.Exception -> L290
            java.lang.String r6 = "is_ringtone= ? "
            java.lang.String[] r7 = new java.lang.String[]{r9}     // Catch: java.lang.Throwable -> L27a java.lang.Exception -> L290
            java.lang.String r8 = "date_added"
            r5 = 0
            android.database.Cursor r5 = r3.query(r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L27a java.lang.Exception -> L290
            boolean r6 = r5.moveToNext()     // Catch: java.lang.Throwable -> L1a0 java.lang.Exception -> L28d
            if (r6 == 0) goto L1a8
            org.json.JSONObject r6 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L1a0 java.lang.Exception -> L1a4
            r6.<init>()     // Catch: java.lang.Throwable -> L1a0 java.lang.Exception -> L1a4
            int r7 = r5.getColumnIndexOrThrow(r15)     // Catch: java.lang.Throwable -> L1a0 java.lang.Exception -> L1a4
            java.lang.String r7 = r5.getString(r7)     // Catch: java.lang.Throwable -> L1a0 java.lang.Exception -> L1a4
            byte[] r7 = r7.getBytes()     // Catch: java.lang.Throwable -> L1a0 java.lang.Exception -> L1a4
            r2.update(r7)     // Catch: java.lang.Throwable -> L1a0 java.lang.Exception -> L1a4
            long r7 = r2.getValue()     // Catch: java.lang.Throwable -> L1a0 java.lang.Exception -> L1a4
            java.lang.String r7 = java.lang.Long.toHexString(r7)     // Catch: java.lang.Throwable -> L1a0 java.lang.Exception -> L1a4
            r6.put(r14, r7)     // Catch: java.lang.Throwable -> L1a0 java.lang.Exception -> L1a4
            int r7 = r5.getColumnIndexOrThrow(r12)     // Catch: java.lang.Throwable -> L1a0 java.lang.Exception -> L1a4
            int r7 = r5.getInt(r7)     // Catch: java.lang.Throwable -> L1a0 java.lang.Exception -> L1a4
            r6.put(r13, r7)     // Catch: java.lang.Throwable -> L1a0 java.lang.Exception -> L1a4
            int r7 = r5.getColumnIndexOrThrow(r10)     // Catch: java.lang.Throwable -> L1a0 java.lang.Exception -> L1a4
            int r7 = r5.getInt(r7)     // Catch: java.lang.Throwable -> L1a0 java.lang.Exception -> L1a4
            r6.put(r11, r7)     // Catch: java.lang.Throwable -> L1a0 java.lang.Exception -> L1a4
            r7 = r16
            r6.put(r1, r7)     // Catch: java.lang.Throwable -> L1a0 java.lang.Exception -> L1a4
            r6.put(r9, r7)     // Catch: java.lang.Throwable -> L1a0 java.lang.Exception -> L1a4
            r0.put(r6)     // Catch: java.lang.Throwable -> L1a0 java.lang.Exception -> L1a4
            goto L1aa
        L1a0:
            r0 = move-exception
            r1 = r5
            goto L296
        L1a4:
            r7 = r0
            goto L286
        L1a8:
            r7 = r16
        L1aa:
            r5.close()     // Catch: java.lang.Throwable -> L1a0 java.lang.Exception -> L28d
            java.lang.String r6 = "is_notification= ? "
            r16 = r7
            java.lang.String[] r7 = new java.lang.String[]{r9}     // Catch: java.lang.Throwable -> L27a java.lang.Exception -> L28b
            java.lang.String r8 = "date_added"
            r5 = 0
            r17 = r0
            r0 = r16
            android.database.Cursor r5 = r3.query(r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L27a java.lang.Exception -> L288
            boolean r6 = r5.moveToNext()     // Catch: java.lang.Throwable -> L1a0 java.lang.Exception -> L20a
            if (r6 == 0) goto L20d
            org.json.JSONObject r6 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L1a0 java.lang.Exception -> L20a
            r6.<init>()     // Catch: java.lang.Throwable -> L1a0 java.lang.Exception -> L20a
            int r7 = r5.getColumnIndexOrThrow(r15)     // Catch: java.lang.Throwable -> L1a0 java.lang.Exception -> L20a
            java.lang.String r7 = r5.getString(r7)     // Catch: java.lang.Throwable -> L1a0 java.lang.Exception -> L20a
            byte[] r7 = r7.getBytes()     // Catch: java.lang.Throwable -> L1a0 java.lang.Exception -> L20a
            r2.update(r7)     // Catch: java.lang.Throwable -> L1a0 java.lang.Exception -> L20a
            long r7 = r2.getValue()     // Catch: java.lang.Throwable -> L1a0 java.lang.Exception -> L20a
            java.lang.String r7 = java.lang.Long.toHexString(r7)     // Catch: java.lang.Throwable -> L1a0 java.lang.Exception -> L20a
            r6.put(r14, r7)     // Catch: java.lang.Throwable -> L1a0 java.lang.Exception -> L20a
            int r7 = r5.getColumnIndexOrThrow(r12)     // Catch: java.lang.Throwable -> L1a0 java.lang.Exception -> L20a
            int r7 = r5.getInt(r7)     // Catch: java.lang.Throwable -> L1a0 java.lang.Exception -> L20a
            r6.put(r13, r7)     // Catch: java.lang.Throwable -> L1a0 java.lang.Exception -> L20a
            int r7 = r5.getColumnIndexOrThrow(r10)     // Catch: java.lang.Throwable -> L1a0 java.lang.Exception -> L20a
            int r7 = r5.getInt(r7)     // Catch: java.lang.Throwable -> L1a0 java.lang.Exception -> L20a
            r6.put(r11, r7)     // Catch: java.lang.Throwable -> L1a0 java.lang.Exception -> L20a
            r6.put(r1, r0)     // Catch: java.lang.Throwable -> L1a0 java.lang.Exception -> L20a
            r6.put(r9, r9)     // Catch: java.lang.Throwable -> L1a0 java.lang.Exception -> L20a
            r7 = r17
            r7.put(r6)     // Catch: java.lang.Throwable -> L1a0 java.lang.Exception -> L207
            goto L20f
        L207:
            goto L286
        L20a:
            r7 = r17
            goto L207
        L20d:
            r7 = r17
        L20f:
            r5.close()     // Catch: java.lang.Throwable -> L1a0 java.lang.Exception -> L207
            java.lang.String r6 = "is_alarm= ? "
            r17 = r7
            java.lang.String[] r7 = new java.lang.String[]{r9}     // Catch: java.lang.Throwable -> L27a java.lang.Exception -> L281
            java.lang.String r8 = "date_added"
            r5 = 0
            r18 = r17
            android.database.Cursor r3 = r3.query(r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L27a java.lang.Exception -> L27d
            boolean r4 = r3.moveToNext()     // Catch: java.lang.Throwable -> L26a java.lang.Exception -> L26f
            if (r4 == 0) goto L272
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L26a java.lang.Exception -> L26f
            r4.<init>()     // Catch: java.lang.Throwable -> L26a java.lang.Exception -> L26f
            int r5 = r3.getColumnIndexOrThrow(r15)     // Catch: java.lang.Throwable -> L26a java.lang.Exception -> L26f
            java.lang.String r5 = r3.getString(r5)     // Catch: java.lang.Throwable -> L26a java.lang.Exception -> L26f
            byte[] r5 = r5.getBytes()     // Catch: java.lang.Throwable -> L26a java.lang.Exception -> L26f
            r2.update(r5)     // Catch: java.lang.Throwable -> L26a java.lang.Exception -> L26f
            long r5 = r2.getValue()     // Catch: java.lang.Throwable -> L26a java.lang.Exception -> L26f
            java.lang.String r2 = java.lang.Long.toHexString(r5)     // Catch: java.lang.Throwable -> L26a java.lang.Exception -> L26f
            r4.put(r14, r2)     // Catch: java.lang.Throwable -> L26a java.lang.Exception -> L26f
            int r2 = r3.getColumnIndexOrThrow(r12)     // Catch: java.lang.Throwable -> L26a java.lang.Exception -> L26f
            int r2 = r3.getInt(r2)     // Catch: java.lang.Throwable -> L26a java.lang.Exception -> L26f
            r4.put(r13, r2)     // Catch: java.lang.Throwable -> L26a java.lang.Exception -> L26f
            int r2 = r3.getColumnIndexOrThrow(r10)     // Catch: java.lang.Throwable -> L26a java.lang.Exception -> L26f
            int r2 = r3.getInt(r2)     // Catch: java.lang.Throwable -> L26a java.lang.Exception -> L26f
            r4.put(r11, r2)     // Catch: java.lang.Throwable -> L26a java.lang.Exception -> L26f
            r4.put(r1, r0)     // Catch: java.lang.Throwable -> L26a java.lang.Exception -> L26f
            r4.put(r9, r1)     // Catch: java.lang.Throwable -> L26a java.lang.Exception -> L26f
            r7 = r18
            r7.put(r4)     // Catch: java.lang.Throwable -> L26a java.lang.Exception -> L26d
            goto L274
        L26a:
            r0 = move-exception
            r1 = r3
            goto L296
        L26d:
            goto L278
        L26f:
            r7 = r18
            goto L26d
        L272:
            r7 = r18
        L274:
            r3.close()
            return r7
        L278:
            r1 = r3
            goto L29c
        L27a:
            r0 = move-exception
            r1 = 0
            goto L296
        L27d:
            r7 = r18
        L27f:
            goto L284
        L281:
            r7 = r17
            goto L27f
        L284:
            r1 = 0
            goto L29c
        L286:
            r1 = r5
            goto L29c
        L288:
            r7 = r17
            goto L27f
        L28b:
            r7 = r0
            goto L27f
        L28d:
            r7 = r0
            goto L207
        L290:
            r7 = r0
            goto L27f
        L292:
            r7 = r0
        L294:
            r1 = r4
            goto L29c
        L296:
            if (r1 == 0) goto L29b
            r1.close()
        L29b:
            throw r0
        L29c:
            if (r1 == 0) goto L2a1
            r1.close()
        L2a1:
            return r7
    }
}

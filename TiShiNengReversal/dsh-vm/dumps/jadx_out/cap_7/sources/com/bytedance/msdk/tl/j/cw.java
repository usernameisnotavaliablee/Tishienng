package com.bytedance.msdk.tl.j;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
public class cw {
    private static volatile com.bytedance.msdk.tl.j.cw j;
    private android.net.Uri xt;

    private cw() {
            r2 = this;
            r2.<init>()
            android.content.Context r0 = com.bytedance.msdk.core.xt.getContext()
            if (r0 == 0) goto L2a
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "content://"
            r0.<init>(r1)
            android.content.Context r1 = com.bytedance.msdk.core.xt.getContext()
            java.lang.String r1 = r1.getPackageName()
            r0.append(r1)
            java.lang.String r1 = ".TTMultiProvider/gromore_prime_rit_adn_perform"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            android.net.Uri r0 = android.net.Uri.parse(r0)
            r2.xt = r0
        L2a:
            return
    }

    public static com.bytedance.msdk.tl.j.cw j() {
            com.bytedance.msdk.tl.j.cw r0 = com.bytedance.msdk.tl.j.cw.j
            if (r0 != 0) goto L19
            java.lang.Class<com.bytedance.msdk.tl.j.cw> r0 = com.bytedance.msdk.tl.j.cw.class
            monitor-enter(r0)
            com.bytedance.msdk.tl.j.cw r1 = com.bytedance.msdk.tl.j.cw.j     // Catch: java.lang.Throwable -> L13
            if (r1 != 0) goto L15
            com.bytedance.msdk.tl.j.cw r1 = new com.bytedance.msdk.tl.j.cw     // Catch: java.lang.Throwable -> L13
            r1.<init>()     // Catch: java.lang.Throwable -> L13
            com.bytedance.msdk.tl.j.cw.j = r1     // Catch: java.lang.Throwable -> L13
            goto L15
        L13:
            r1 = move-exception
            goto L17
        L15:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            goto L19
        L17:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            throw r1
        L19:
            com.bytedance.msdk.tl.j.cw r0 = com.bytedance.msdk.tl.j.cw.j
            return r0
    }

    public void insert(java.lang.String r4, java.lang.String r5, java.lang.String r6, java.lang.String r7) {
            r3 = this;
            android.content.Context r0 = com.bytedance.msdk.core.xt.getContext()
            if (r0 == 0) goto L3d
            android.net.Uri r0 = r3.xt
            if (r0 == 0) goto L3d
            android.content.Context r0 = com.bytedance.msdk.core.xt.getContext()
            android.content.ContentResolver r0 = r0.getContentResolver()
            android.content.ContentValues r1 = new android.content.ContentValues
            r1.<init>()
            java.lang.String r2 = "adn_name"
            r1.put(r2, r4)
            java.lang.String r4 = "prime_rit"
            r1.put(r4, r5)
            java.lang.String r4 = "adn_rit"
            r1.put(r4, r6)
            java.lang.String r4 = "ad_action"
            r1.put(r4, r7)
            long r4 = java.lang.System.currentTimeMillis()
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            java.lang.String r5 = "time_stamp"
            r1.put(r5, r4)
            android.net.Uri r4 = r3.xt
            r0.insert(r4, r1)
        L3d:
            return
    }

    public void j(java.lang.String r4, long r5) {
            r3 = this;
            android.content.Context r0 = com.bytedance.msdk.core.xt.getContext()
            if (r0 == 0) goto L27
            android.net.Uri r0 = r3.xt
            if (r0 == 0) goto L27
            r0 = 0
            int r2 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r2 <= 0) goto L27
            android.content.Context r0 = com.bytedance.msdk.core.xt.getContext()
            android.content.ContentResolver r0 = r0.getContentResolver()
            java.lang.String r1 = "prime_rit=? AND time_stamp<?"
            java.lang.String r5 = java.lang.String.valueOf(r5)
            java.lang.String[] r4 = new java.lang.String[]{r4, r5}
            android.net.Uri r5 = r3.xt     // Catch: java.lang.IllegalStateException -> L27
            r0.delete(r5, r1, r4)     // Catch: java.lang.IllegalStateException -> L27
        L27:
            return
    }

    public java.util.List<com.bytedance.msdk.tl.j.xt> query(java.lang.String r8, java.lang.String r9, long r10, long r12) {
            r7 = this;
            android.content.Context r0 = com.bytedance.msdk.core.xt.getContext()
            if (r0 == 0) goto Lb2
            android.net.Uri r0 = r7.xt
            if (r0 == 0) goto Lb2
            android.content.Context r0 = com.bytedance.msdk.core.xt.getContext()
            android.content.ContentResolver r0 = r0.getContentResolver()
            r1 = 4
            java.lang.String[] r1 = new java.lang.String[r1]
            r2 = 0
            r1[r2] = r8
            r3 = 1
            r1[r3] = r9
            java.lang.String r4 = java.lang.String.valueOf(r10)
            r5 = 2
            r1[r5] = r4
            java.lang.String r4 = java.lang.String.valueOf(r12)
            r6 = 3
            r1[r6] = r4
            boolean r8 = android.text.TextUtils.isEmpty(r8)
            if (r8 == 0) goto L44
            java.lang.String[] r1 = new java.lang.String[r6]
            r1[r2] = r9
            java.lang.String r8 = java.lang.String.valueOf(r10)
            r1[r3] = r8
            java.lang.String r8 = java.lang.String.valueOf(r12)
            r1[r5] = r8
            java.lang.String r8 = "prime_rit=? AND time_stamp>=? AND time_stamp<?"
        L41:
            r11 = r8
            r12 = r1
            goto L47
        L44:
            java.lang.String r8 = "adn_name=? AND prime_rit=? AND time_stamp>=? AND time_stamp<?"
            goto L41
        L47:
            android.net.Uri r9 = r7.xt
            r10 = 0
            r13 = 0
            r8 = r0
            android.database.Cursor r8 = r8.query(r9, r10, r11, r12, r13)
            if (r8 == 0) goto Lb2
            java.util.LinkedList r9 = new java.util.LinkedList
            r9.<init>()
        L57:
            boolean r10 = r8.moveToNext()     // Catch: java.lang.Throwable -> La7
            if (r10 == 0) goto Laa
            java.lang.String r10 = "adn_name"
            int r10 = r8.getColumnIndex(r10)     // Catch: java.lang.Throwable -> La7
            java.lang.String r10 = r8.getString(r10)     // Catch: java.lang.Throwable -> La7
            java.lang.String r11 = "prime_rit"
            int r11 = r8.getColumnIndex(r11)     // Catch: java.lang.Throwable -> La7
            java.lang.String r11 = r8.getString(r11)     // Catch: java.lang.Throwable -> La7
            java.lang.String r12 = "adn_rit"
            int r12 = r8.getColumnIndex(r12)     // Catch: java.lang.Throwable -> La7
            java.lang.String r12 = r8.getString(r12)     // Catch: java.lang.Throwable -> La7
            java.lang.String r13 = "ad_action"
            int r13 = r8.getColumnIndex(r13)     // Catch: java.lang.Throwable -> La7
            java.lang.String r13 = r8.getString(r13)     // Catch: java.lang.Throwable -> La7
            java.lang.String r0 = "time_stamp"
            int r0 = r8.getColumnIndex(r0)     // Catch: java.lang.Throwable -> La7
            long r0 = r8.getLong(r0)     // Catch: java.lang.Throwable -> La7
            com.bytedance.msdk.tl.j.xt r2 = new com.bytedance.msdk.tl.j.xt     // Catch: java.lang.Throwable -> La7
            r2.<init>()     // Catch: java.lang.Throwable -> La7
            r2.cw(r10)     // Catch: java.lang.Throwable -> La7
            r2.j(r11)     // Catch: java.lang.Throwable -> La7
            r2.xt(r12)     // Catch: java.lang.Throwable -> La7
            r2.r(r13)     // Catch: java.lang.Throwable -> La7
            r2.j(r0)     // Catch: java.lang.Throwable -> La7
            r9.add(r2)     // Catch: java.lang.Throwable -> La7
            goto L57
        La7:
            r0 = move-exception
            r9 = r0
            goto Lae
        Laa:
            r8.close()
            return r9
        Lae:
            r8.close()
            throw r9
        Lb2:
            r8 = 0
            return r8
    }
}

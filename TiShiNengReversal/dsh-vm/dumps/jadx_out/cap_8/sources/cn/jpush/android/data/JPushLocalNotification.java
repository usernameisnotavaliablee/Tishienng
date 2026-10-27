package cn.jpush.android.data;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class JPushLocalNotification implements java.io.Serializable {
    private static final long serialVersionUID = 1472982106750878137L;
    private int a;

    /* renamed from: b, reason: collision with root package name */
    private java.lang.String f1775b;

    /* renamed from: c, reason: collision with root package name */
    private java.lang.String f1776c;

    /* renamed from: d, reason: collision with root package name */
    private java.lang.String f1777d;

    /* renamed from: e, reason: collision with root package name */
    private long f1778e;

    /* renamed from: f, reason: collision with root package name */
    private java.lang.String f1779f;

    /* renamed from: g, reason: collision with root package name */
    private java.lang.String f1780g;

    /* renamed from: h, reason: collision with root package name */
    private java.lang.String f1781h;

    /* renamed from: i, reason: collision with root package name */
    private long f1782i;

    /* renamed from: j, reason: collision with root package name */
    private long f1783j;

    /* renamed from: k, reason: collision with root package name */
    private int f1784k;
    private java.lang.String l;
    private java.lang.String m;
    private int n;
    private java.lang.String o;

    public JPushLocalNotification() {
            r4 = this;
            r4.<init>()
            r0 = 1
            r4.a = r0
            java.lang.String r1 = ""
            r4.f1775b = r1
            java.lang.String r2 = "00"
            r4.f1776c = r2
            r4.f1777d = r2
            r2 = 0
            r4.f1778e = r2
            r2 = 1
            r4.f1783j = r2
            r4.f1784k = r0
            r4.l = r1
            r4.m = r1
            r0 = 0
            r4.n = r0
            r4.o = r1
            return
    }

    private void a(java.lang.String r2, java.lang.String r3, org.json.JSONObject r4) {
            r1 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 != 0) goto L9
            r4.put(r2, r3)
        L9:
            return
    }

    public boolean equals(java.lang.Object r7) {
            r6 = this;
            r0 = 1
            if (r6 != r7) goto L4
            return r0
        L4:
            r1 = 0
            if (r7 == 0) goto L1d
            java.lang.Class r2 = r6.getClass()
            java.lang.Class r3 = r7.getClass()
            if (r2 == r3) goto L12
            goto L1d
        L12:
            cn.jpush.android.data.JPushLocalNotification r7 = (cn.jpush.android.data.JPushLocalNotification) r7
            long r2 = r6.f1783j
            long r4 = r7.f1783j
            int r7 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r7 != 0) goto L1d
            return r0
        L1d:
            return r1
    }

    public long getBroadcastTime() {
            r2 = this;
            long r0 = r2.f1778e
            return r0
    }

    public long getBuilderId() {
            r2 = this;
            long r0 = r2.f1782i
            return r0
    }

    public java.lang.String getCategory() {
            r1 = this;
            java.lang.String r0 = r1.o
            return r0
    }

    public java.lang.String getContent() {
            r1 = this;
            java.lang.String r0 = r1.f1779f
            return r0
    }

    public java.lang.String getExtras() {
            r1 = this;
            java.lang.String r0 = r1.f1781h
            return r0
    }

    public long getNotificationId() {
            r2 = this;
            long r0 = r2.f1783j
            return r0
    }

    public int getPriority() {
            r1 = this;
            int r0 = r1.n
            return r0
    }

    public java.lang.String getTitle() {
            r1 = this;
            java.lang.String r0 = r1.f1780g
            return r0
    }

    public int hashCode() {
            r4 = this;
            long r0 = r4.f1783j
            r2 = 32
            long r2 = r0 >>> r2
            long r0 = r0 ^ r2
            int r1 = (int) r0
            return r1
    }

    public void setBroadcastTime(int r10, int r11, int r12, int r13, int r14, int r15) {
            r9 = this;
            if (r10 < 0) goto L48
            r0 = 1
            if (r11 < r0) goto L48
            r1 = 12
            if (r11 > r1) goto L48
            if (r12 < r0) goto L48
            r1 = 31
            if (r12 > r1) goto L48
            if (r13 < 0) goto L48
            r1 = 23
            if (r13 > r1) goto L48
            if (r14 < 0) goto L48
            r1 = 59
            if (r14 > r1) goto L48
            if (r15 < 0) goto L48
            if (r15 <= r1) goto L20
            goto L48
        L20:
            java.util.Calendar r2 = java.util.Calendar.getInstance()
            int r4 = r11 + (-1)
            r3 = r10
            r5 = r12
            r6 = r13
            r7 = r14
            r8 = r15
            r2.set(r3, r4, r5, r6, r7, r8)
            java.util.Date r10 = r2.getTime()
            long r11 = java.lang.System.currentTimeMillis()
            long r13 = r10.getTime()
            int r15 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r15 >= 0) goto L41
            r9.f1778e = r11
            return
        L41:
            long r10 = r10.getTime()
            r9.f1778e = r10
            return
        L48:
            java.lang.String r10 = "JPushLocalNotification"
            java.lang.String r11 = "Set time fail! Please check your args!"
            cn.jpush.android.helper.Logger.ee(r10, r11)
            return
    }

    public void setBroadcastTime(long r1) {
            r0 = this;
            r0.f1778e = r1
            return
    }

    public void setBroadcastTime(java.util.Date r3) {
            r2 = this;
            long r0 = r3.getTime()
            r2.f1778e = r0
            return
    }

    public void setBuilderId(long r1) {
            r0 = this;
            r0.f1782i = r1
            return
    }

    public void setCategory(java.lang.String r1) {
            r0 = this;
            r0.o = r1
            return
    }

    public void setContent(java.lang.String r1) {
            r0 = this;
            r0.f1779f = r1
            return
    }

    public void setExtras(java.lang.String r1) {
            r0 = this;
            r0.f1781h = r1
            return
    }

    public void setNotificationId(long r1) {
            r0 = this;
            int r2 = (int) r1
            long r1 = (long) r2
            r0.f1783j = r1
            return
    }

    public void setPriority(int r1) {
            r0 = this;
            r0.n = r1
            return
    }

    public void setTitle(java.lang.String r1) {
            r0 = this;
            r0.f1780g = r1
            return
    }

    public java.lang.String toJSON() {
            r5 = this;
            java.lang.String r0 = "n_content"
            org.json.JSONObject r1 = new org.json.JSONObject
            r1.<init>()
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch: org.json.JSONException -> L8a
            r2.<init>()     // Catch: org.json.JSONException -> L8a
            java.lang.String r3 = r5.f1781h     // Catch: org.json.JSONException -> L8a
            boolean r3 = android.text.TextUtils.isEmpty(r3)     // Catch: org.json.JSONException -> L8a
            if (r3 != 0) goto L20
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch: org.json.JSONException -> L8a
            java.lang.String r4 = r5.f1781h     // Catch: org.json.JSONException -> L8a
            r3.<init>(r4)     // Catch: org.json.JSONException -> L8a
            java.lang.String r4 = "n_extras"
            r2.put(r4, r3)     // Catch: org.json.JSONException -> L8a
        L20:
            java.lang.String r3 = "n_priority"
            int r4 = r5.n     // Catch: org.json.JSONException -> L8a
            r2.put(r3, r4)     // Catch: org.json.JSONException -> L8a
            java.lang.String r3 = "n_category"
            java.lang.String r4 = r5.o     // Catch: org.json.JSONException -> L8a
            r5.a(r3, r4, r2)     // Catch: org.json.JSONException -> L8a
            java.lang.String r3 = r5.f1779f     // Catch: org.json.JSONException -> L8a
            r5.a(r0, r3, r2)     // Catch: org.json.JSONException -> L8a
            java.lang.String r3 = "n_title"
            java.lang.String r4 = r5.f1780g     // Catch: org.json.JSONException -> L8a
            r5.a(r3, r4, r2)     // Catch: org.json.JSONException -> L8a
            java.lang.String r3 = r5.f1779f     // Catch: org.json.JSONException -> L8a
            r5.a(r0, r3, r2)     // Catch: org.json.JSONException -> L8a
            java.lang.String r0 = "ad_t"
            r3 = 0
            r2.put(r0, r3)     // Catch: org.json.JSONException -> L8a
            java.lang.String r0 = "m_content"
            r1.put(r0, r2)     // Catch: org.json.JSONException -> L8a
            java.lang.String r0 = "msg_id"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: org.json.JSONException -> L8a
            r2.<init>()     // Catch: org.json.JSONException -> L8a
            java.lang.String r3 = ""
            r2.append(r3)     // Catch: org.json.JSONException -> L8a
            long r3 = r5.f1783j     // Catch: org.json.JSONException -> L8a
            r2.append(r3)     // Catch: org.json.JSONException -> L8a
            java.lang.String r2 = r2.toString()     // Catch: org.json.JSONException -> L8a
            r5.a(r0, r2, r1)     // Catch: org.json.JSONException -> L8a
            java.lang.String r0 = "content_type"
            java.lang.String r2 = r5.m     // Catch: org.json.JSONException -> L8a
            r5.a(r0, r2, r1)     // Catch: org.json.JSONException -> L8a
            java.lang.String r0 = "override_msg_id"
            java.lang.String r2 = r5.l     // Catch: org.json.JSONException -> L8a
            r5.a(r0, r2, r1)     // Catch: org.json.JSONException -> L8a
            java.lang.String r0 = "n_only"
            int r2 = r5.f1784k     // Catch: org.json.JSONException -> L8a
            r1.put(r0, r2)     // Catch: org.json.JSONException -> L8a
            java.lang.String r0 = "n_builder_id"
            long r2 = r5.f1782i     // Catch: org.json.JSONException -> L8a
            r1.put(r0, r2)     // Catch: org.json.JSONException -> L8a
            java.lang.String r0 = "show_type"
            r2 = 3
            r1.put(r0, r2)     // Catch: org.json.JSONException -> L8a
            java.lang.String r0 = "notificaion_type"
            r2 = 1
            r1.put(r0, r2)     // Catch: org.json.JSONException -> L8a
        L8a:
            java.lang.String r0 = r1.toString()
            return r0
    }
}

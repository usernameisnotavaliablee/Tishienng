package cn.jpush.android.api;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class JPushMessage implements java.io.Serializable {
    private static final long serialVersionUID = 1;
    public int a;

    /* renamed from: b, reason: collision with root package name */
    public int f1702b;

    /* renamed from: c, reason: collision with root package name */
    private java.lang.String f1703c;

    /* renamed from: d, reason: collision with root package name */
    private java.util.Set<java.lang.String> f1704d;

    /* renamed from: e, reason: collision with root package name */
    private java.util.Map<java.lang.String, java.lang.Object> f1705e;

    /* renamed from: f, reason: collision with root package name */
    private java.lang.String f1706f;

    /* renamed from: g, reason: collision with root package name */
    private int f1707g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f1708h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f1709i;

    /* renamed from: j, reason: collision with root package name */
    private int f1710j;

    /* renamed from: k, reason: collision with root package name */
    private java.lang.String f1711k;

    public JPushMessage() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.a = r0
            r1.f1702b = r0
            return
    }

    public int getAction() {
            r1 = this;
            int r0 = r1.f1702b
            return r0
    }

    public java.lang.String getAlias() {
            r1 = this;
            java.lang.String r0 = r1.f1703c
            return r0
    }

    public java.lang.String getCheckTag() {
            r1 = this;
            java.lang.String r0 = r1.f1706f
            return r0
    }

    public int getErrorCode() {
            r1 = this;
            int r0 = r1.f1707g
            return r0
    }

    public java.lang.String getMobileNumber() {
            r1 = this;
            java.lang.String r0 = r1.f1711k
            return r0
    }

    public java.util.Map<java.lang.String, java.lang.Object> getPros() {
            r1 = this;
            java.util.Map<java.lang.String, java.lang.Object> r0 = r1.f1705e
            return r0
    }

    public int getProtoType() {
            r1 = this;
            int r0 = r1.a
            return r0
    }

    public int getSequence() {
            r1 = this;
            int r0 = r1.f1710j
            return r0
    }

    public boolean getTagCheckStateResult() {
            r1 = this;
            boolean r0 = r1.f1708h
            return r0
    }

    public java.util.Set<java.lang.String> getTags() {
            r1 = this;
            java.util.Set<java.lang.String> r0 = r1.f1704d
            return r0
    }

    public boolean isTagCheckOperator() {
            r1 = this;
            boolean r0 = r1.f1709i
            return r0
    }

    public void setAction(int r1) {
            r0 = this;
            r0.f1702b = r1
            return
    }

    public void setAlias(java.lang.String r1) {
            r0 = this;
            r0.f1703c = r1
            return
    }

    public void setCheckTag(java.lang.String r1) {
            r0 = this;
            r0.f1706f = r1
            return
    }

    public void setErrorCode(int r1) {
            r0 = this;
            r0.f1707g = r1
            return
    }

    public void setMobileNumber(java.lang.String r1) {
            r0 = this;
            r0.f1711k = r1
            return
    }

    public void setPros(java.util.Map<java.lang.String, java.lang.Object> r1) {
            r0 = this;
            r0.f1705e = r1
            return
    }

    public void setProtoType(int r1) {
            r0 = this;
            r0.a = r1
            return
    }

    public void setSequence(int r1) {
            r0 = this;
            r0.f1710j = r1
            return
    }

    public void setTagCheckOperator(boolean r1) {
            r0 = this;
            r0.f1709i = r1
            return
    }

    public void setTagCheckStateResult(boolean r1) {
            r0 = this;
            r0.f1708h = r1
            return
    }

    public void setTags(java.util.Set<java.lang.String> r1) {
            r0 = this;
            r0.f1704d = r1
            return
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "JPushMessage{alias='"
            r0.append(r1)
            java.lang.String r1 = r3.f1703c
            r0.append(r1)
            r1 = 39
            r0.append(r1)
            java.lang.String r2 = ", tags="
            r0.append(r2)
            java.util.Set<java.lang.String> r2 = r3.f1704d
            r0.append(r2)
            java.lang.String r2 = ", pros="
            r0.append(r2)
            java.util.Map<java.lang.String, java.lang.Object> r2 = r3.f1705e
            r0.append(r2)
            java.lang.String r2 = ", checkTag='"
            r0.append(r2)
            java.lang.String r2 = r3.f1706f
            r0.append(r2)
            r0.append(r1)
            java.lang.String r1 = ", errorCode="
            r0.append(r1)
            int r1 = r3.f1707g
            r0.append(r1)
            java.lang.String r1 = ", tagCheckStateResult="
            r0.append(r1)
            boolean r1 = r3.f1708h
            r0.append(r1)
            java.lang.String r1 = ", isTagCheckOperator="
            r0.append(r1)
            boolean r1 = r3.f1709i
            r0.append(r1)
            java.lang.String r1 = ", sequence="
            r0.append(r1)
            int r1 = r3.f1710j
            r0.append(r1)
            java.lang.String r1 = ", mobileNumber="
            r0.append(r1)
            java.lang.String r1 = r3.f1711k
            r0.append(r1)
            r1 = 125(0x7d, float:1.75E-43)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}

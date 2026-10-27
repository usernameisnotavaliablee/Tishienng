package cn.jiguang.commons.bean;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class ControlGroup implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<cn.jiguang.commons.bean.ControlGroup> CREATOR = null;
    public final int a;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f973c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f974d;

    class a implements android.os.Parcelable.Creator {
        a() {
                r0 = this;
                r0.<init>()
                return
        }

        public cn.jiguang.commons.bean.ControlGroup a(android.os.Parcel r2) {
                r1 = this;
                cn.jiguang.commons.bean.ControlGroup r0 = new cn.jiguang.commons.bean.ControlGroup
                r0.<init>(r2)
                return r0
        }

        public cn.jiguang.commons.bean.ControlGroup[] a(int r1) {
                r0 = this;
                cn.jiguang.commons.bean.ControlGroup[] r1 = new cn.jiguang.commons.bean.ControlGroup[r1]
                return r1
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel r1) {
                r0 = this;
                cn.jiguang.commons.bean.ControlGroup r1 = r0.a(r1)
                return r1
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ java.lang.Object[] newArray(int r1) {
                r0 = this;
                cn.jiguang.commons.bean.ControlGroup[] r1 = r0.a(r1)
                return r1
        }
    }

    static {
            cn.jiguang.commons.bean.ControlGroup$a r0 = new cn.jiguang.commons.bean.ControlGroup$a
            r0.<init>()
            cn.jiguang.commons.bean.ControlGroup.CREATOR = r0
            return
    }

    protected ControlGroup(android.os.Parcel r2) {
            r1 = this;
            r1.<init>()
            int r0 = r2.readInt()
            r1.a = r0
            java.lang.String r0 = r2.readString()
            r1.f973c = r0
            java.lang.String r2 = r2.readString()
            r1.f974d = r2
            return
    }

    protected ControlGroup(java.lang.String r2) {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = ":"
            java.lang.String[] r2 = r2.split(r0)
            r0 = 0
            r0 = r2[r0]
            int r0 = java.lang.Integer.parseInt(r0)
            r1.a = r0
            r0 = 1
            r0 = r2[r0]
            r1.f973c = r0
            r0 = 2
            r2 = r2[r0]
            r1.f974d = r2
            return
    }

    @Override // android.os.Parcelable
    public int describeContents() {
            r1 = this;
            r0 = 0
            return r0
    }

    public java.lang.String toString() {
            r6 = this;
            java.util.Locale r0 = java.util.Locale.ENGLISH
            int r1 = r6.a
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = r6.f973c
            java.lang.String r3 = r6.f974d
            r4 = 3
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r5 = 0
            r4[r5] = r1
            r1 = 1
            r4[r1] = r2
            r1 = 2
            r4[r1] = r3
            java.lang.String r1 = "%d:%s:%s"
            java.lang.String r0 = java.lang.String.format(r0, r1, r4)
            return r0
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel r1, int r2) {
            r0 = this;
            int r2 = r0.a
            r1.writeInt(r2)
            java.lang.String r2 = r0.f973c
            r1.writeString(r2)
            java.lang.String r2 = r0.f974d
            r1.writeString(r2)
            return
    }
}

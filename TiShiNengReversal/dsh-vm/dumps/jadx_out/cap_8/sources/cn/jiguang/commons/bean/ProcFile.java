package cn.jiguang.commons.bean;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class ProcFile extends java.io.File implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<cn.jiguang.commons.bean.ProcFile> CREATOR = null;
    public final java.lang.String a;

    class a implements android.os.Parcelable.Creator {
        a() {
                r0 = this;
                r0.<init>()
                return
        }

        public cn.jiguang.commons.bean.ProcFile a(android.os.Parcel r2) {
                r1 = this;
                cn.jiguang.commons.bean.ProcFile r0 = new cn.jiguang.commons.bean.ProcFile
                r0.<init>(r2)
                return r0
        }

        public cn.jiguang.commons.bean.ProcFile[] a(int r1) {
                r0 = this;
                cn.jiguang.commons.bean.ProcFile[] r1 = new cn.jiguang.commons.bean.ProcFile[r1]
                return r1
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel r1) {
                r0 = this;
                cn.jiguang.commons.bean.ProcFile r1 = r0.a(r1)
                return r1
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ java.lang.Object[] newArray(int r1) {
                r0 = this;
                cn.jiguang.commons.bean.ProcFile[] r1 = r0.a(r1)
                return r1
        }
    }

    static {
            cn.jiguang.commons.bean.ProcFile$a r0 = new cn.jiguang.commons.bean.ProcFile$a
            r0.<init>()
            cn.jiguang.commons.bean.ProcFile.CREATOR = r0
            return
    }

    protected ProcFile(android.os.Parcel r2) {
            r1 = this;
            java.lang.String r0 = r2.readString()
            r1.<init>(r0)
            java.lang.String r2 = r2.readString()
            r1.a = r2
            return
    }

    protected ProcFile(java.lang.String r1) {
            r0 = this;
            r0.<init>(r1)
            java.lang.String r1 = a(r1)
            r0.a = r1
            return
    }

    public static java.lang.String a(java.lang.String r3) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.io.BufferedReader r1 = new java.io.BufferedReader
            java.io.FileReader r2 = new java.io.FileReader
            r2.<init>(r3)
            r1.<init>(r2)
        Lf:
            java.lang.String r3 = r1.readLine()     // Catch: java.lang.Throwable -> L20
            if (r3 == 0) goto L22
            r0.append(r3)     // Catch: java.lang.Throwable -> L20
            java.lang.String r3 = java.lang.System.lineSeparator()     // Catch: java.lang.Throwable -> L20
            r0.append(r3)     // Catch: java.lang.Throwable -> L20
            goto Lf
        L20:
            r3 = move-exception
            goto L2e
        L22:
            r1.close()
            java.lang.String r3 = r0.toString()
            java.lang.String r3 = r3.trim()
            return r3
        L2e:
            r1.close()     // Catch: java.lang.Throwable -> L32
            goto L36
        L32:
            r0 = move-exception
            r3.addSuppressed(r0)
        L36:
            throw r3
    }

    @Override // android.os.Parcelable
    public int describeContents() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // java.io.File
    public long length() {
            r2 = this;
            java.lang.String r0 = r2.a
            int r0 = r0.length()
            long r0 = (long) r0
            return r0
    }

    public void writeToParcel(android.os.Parcel r1, int r2) {
            r0 = this;
            java.lang.String r2 = r0.getAbsolutePath()
            r1.writeString(r2)
            java.lang.String r2 = r0.a
            r1.writeString(r2)
            return
    }
}

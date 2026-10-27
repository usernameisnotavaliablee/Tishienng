package cn.jpush.android.data;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class JPushCollectControl implements java.io.Serializable {
    private static final int APP_LISTS = 1001;
    public static final int APP_RUNNING = 1013;
    private static final int BSSID = 1007;
    private static final int CELL = 1008;
    private static final int GPS = 1000;
    private static final int IMEI = 1003;
    public static final int IMSI = 1010;
    private static final int MAC = 1005;
    private static final int SSID = 1006;
    public static final int WIFI = 1012;
    private static final long serialVersionUID = -3135447319267654288L;
    private java.util.ArrayList<java.lang.Integer> mDisableDatas;
    private java.util.ArrayList<java.lang.Integer> mEnableDatas;

    public static class Builder {
        private java.util.Set<java.lang.Integer> mDisableDatas;
        private java.util.Set<java.lang.Integer> mEnableDatas;

        public Builder() {
                r1 = this;
                r1.<init>()
                java.util.HashSet r0 = new java.util.HashSet
                r0.<init>()
                r1.mEnableDatas = r0
                java.util.HashSet r0 = new java.util.HashSet
                r0.<init>()
                r1.mDisableDatas = r0
                return
        }

        static /* synthetic */ java.util.Set access$000(cn.jpush.android.data.JPushCollectControl.Builder r0) {
                java.util.Set<java.lang.Integer> r0 = r0.mDisableDatas
                return r0
        }

        static /* synthetic */ java.util.Set access$100(cn.jpush.android.data.JPushCollectControl.Builder r0) {
                java.util.Set<java.lang.Integer> r0 = r0.mEnableDatas
                return r0
        }

        private void disable(int r3) {
                r2 = this;
                java.util.Set<java.lang.Integer> r0 = r2.mEnableDatas
                java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
                r0.remove(r1)
                java.util.Set<java.lang.Integer> r0 = r2.mDisableDatas
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                r0.add(r3)
                return
        }

        private void enable(int r3) {
                r2 = this;
                java.util.Set<java.lang.Integer> r0 = r2.mDisableDatas
                java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
                r0.remove(r1)
                java.util.Set<java.lang.Integer> r0 = r2.mEnableDatas
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                r0.add(r3)
                return
        }

        private void set(boolean r1, int r2) {
                r0 = this;
                if (r1 == 0) goto L6
                r0.enable(r2)
                return
            L6:
                r0.disable(r2)
                return
        }

        public cn.jpush.android.data.JPushCollectControl.Builder bssid(boolean r2) {
                r1 = this;
                r0 = 1007(0x3ef, float:1.411E-42)
                r1.set(r2, r0)
                if (r2 != 0) goto Lb
                r2 = 0
                r1.wifi(r2)
            Lb:
                return r1
        }

        public cn.jpush.android.data.JPushCollectControl build() {
                r1 = this;
                cn.jpush.android.data.JPushCollectControl r0 = new cn.jpush.android.data.JPushCollectControl
                r0.<init>(r1)
                return r0
        }

        public cn.jpush.android.data.JPushCollectControl.Builder cell(boolean r2) {
                r1 = this;
                r0 = 1008(0x3f0, float:1.413E-42)
                r1.set(r2, r0)
                return r1
        }

        public cn.jpush.android.data.JPushCollectControl.Builder imei(boolean r2) {
                r1 = this;
                r0 = 1003(0x3eb, float:1.406E-42)
                r1.set(r2, r0)
                return r1
        }

        public cn.jpush.android.data.JPushCollectControl.Builder imsi(boolean r2) {
                r1 = this;
                r0 = 1010(0x3f2, float:1.415E-42)
                r1.set(r2, r0)
                return r1
        }

        public cn.jpush.android.data.JPushCollectControl.Builder mac(boolean r2) {
                r1 = this;
                r0 = 1005(0x3ed, float:1.408E-42)
                r1.set(r2, r0)
                return r1
        }

        public cn.jpush.android.data.JPushCollectControl.Builder ssid(boolean r2) {
                r1 = this;
                r0 = 1006(0x3ee, float:1.41E-42)
                r1.set(r2, r0)
                if (r2 != 0) goto Lb
                r2 = 0
                r1.wifi(r2)
            Lb:
                return r1
        }

        public cn.jpush.android.data.JPushCollectControl.Builder wifi(boolean r2) {
                r1 = this;
                r0 = 1012(0x3f4, float:1.418E-42)
                r1.set(r2, r0)
                return r1
        }
    }

    public JPushCollectControl(cn.jpush.android.data.JPushCollectControl.Builder r3) {
            r2 = this;
            r2.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r2.mEnableDatas = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r2.mDisableDatas = r0
            java.util.Set r0 = cn.jpush.android.data.JPushCollectControl.Builder.access$000(r3)
            if (r0 == 0) goto L2a
            java.util.Set r0 = cn.jpush.android.data.JPushCollectControl.Builder.access$000(r3)
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L2a
            java.util.ArrayList<java.lang.Integer> r0 = r2.mDisableDatas
            java.util.Set r1 = cn.jpush.android.data.JPushCollectControl.Builder.access$000(r3)
            r0.addAll(r1)
        L2a:
            java.util.Set r0 = cn.jpush.android.data.JPushCollectControl.Builder.access$100(r3)
            if (r0 == 0) goto L43
            java.util.Set r0 = cn.jpush.android.data.JPushCollectControl.Builder.access$100(r3)
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L43
            java.util.ArrayList<java.lang.Integer> r0 = r2.mEnableDatas
            java.util.Set r3 = cn.jpush.android.data.JPushCollectControl.Builder.access$100(r3)
            r0.addAll(r3)
        L43:
            return
    }

    public java.util.ArrayList<java.lang.Integer> getDisableDatas() {
            r1 = this;
            java.util.ArrayList<java.lang.Integer> r0 = r1.mDisableDatas
            return r0
    }

    public java.util.ArrayList<java.lang.Integer> getEnableDatas() {
            r1 = this;
            java.util.ArrayList<java.lang.Integer> r0 = r1.mEnableDatas
            return r0
    }
}

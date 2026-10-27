package com.bytedance.android.openliveplugin.stub.activity;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class StubActivity {

    public static class Activity_Portrait extends com.bytedance.android.openliveplugin.stub.activity.StubActivity.SuperActivity {
        public Activity_Portrait() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // com.bytedance.android.openliveplugin.stub.activity.StubActivity.SuperActivity
        public /* bridge */ /* synthetic */ java.lang.String getPluginPkgName() {
                r1 = this;
                java.lang.String r0 = super.getPluginPkgName()
                return r0
        }

        @Override // com.bytedance.android.openliveplugin.stub.activity.StubActivity.SuperActivity
        public /* bridge */ /* synthetic */ void onWindowFocusChanged(boolean r1) {
                r0 = this;
                super.onWindowFocusChanged(r1)
                return
        }
    }

    public static class Activity_Portrait2 extends com.bytedance.android.openliveplugin.stub.activity.StubActivity.SuperActivity {
        public Activity_Portrait2() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // com.bytedance.android.openliveplugin.stub.activity.StubActivity.SuperActivity
        public /* bridge */ /* synthetic */ java.lang.String getPluginPkgName() {
                r1 = this;
                java.lang.String r0 = super.getPluginPkgName()
                return r0
        }

        @Override // com.bytedance.android.openliveplugin.stub.activity.StubActivity.SuperActivity
        public /* bridge */ /* synthetic */ void onWindowFocusChanged(boolean r1) {
                r0 = this;
                super.onWindowFocusChanged(r1)
                return
        }
    }

    public static class Activity_Portrait3 extends com.bytedance.android.openliveplugin.stub.activity.StubActivity.SuperActivity {
        public Activity_Portrait3() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // com.bytedance.android.openliveplugin.stub.activity.StubActivity.SuperActivity
        public /* bridge */ /* synthetic */ java.lang.String getPluginPkgName() {
                r1 = this;
                java.lang.String r0 = super.getPluginPkgName()
                return r0
        }

        @Override // com.bytedance.android.openliveplugin.stub.activity.StubActivity.SuperActivity
        public /* bridge */ /* synthetic */ void onWindowFocusChanged(boolean r1) {
                r0 = this;
                super.onWindowFocusChanged(r1)
                return
        }
    }

    public static class Activity_Portrait4 extends com.bytedance.android.openliveplugin.stub.activity.StubActivity.SuperActivity {
        public Activity_Portrait4() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // com.bytedance.android.openliveplugin.stub.activity.StubActivity.SuperActivity
        public /* bridge */ /* synthetic */ java.lang.String getPluginPkgName() {
                r1 = this;
                java.lang.String r0 = super.getPluginPkgName()
                return r0
        }

        @Override // com.bytedance.android.openliveplugin.stub.activity.StubActivity.SuperActivity
        public /* bridge */ /* synthetic */ void onWindowFocusChanged(boolean r1) {
                r0 = this;
                super.onWindowFocusChanged(r1)
                return
        }
    }

    public static class Activity_Portrait5 extends com.bytedance.android.openliveplugin.stub.activity.StubActivity.SuperActivity {
        public Activity_Portrait5() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // com.bytedance.android.openliveplugin.stub.activity.StubActivity.SuperActivity
        public /* bridge */ /* synthetic */ java.lang.String getPluginPkgName() {
                r1 = this;
                java.lang.String r0 = super.getPluginPkgName()
                return r0
        }

        @Override // com.bytedance.android.openliveplugin.stub.activity.StubActivity.SuperActivity
        public /* bridge */ /* synthetic */ void onWindowFocusChanged(boolean r1) {
                r0 = this;
                super.onWindowFocusChanged(r1)
                return
        }
    }

    static class SuperActivity extends com.bytedance.android.dy.sdk.pangle.ZeusPlatformProxyActivity {
        android.os.Handler handler;



        SuperActivity() {
                r0 = this;
                r0.<init>()
                return
        }

        static /* synthetic */ void access$000(com.bytedance.android.openliveplugin.stub.activity.StubActivity.SuperActivity r0) {
                r0.execAsyncCheckReport()
                return
        }

        private void execAsyncCheckReport() {
                r2 = this;
                java.util.concurrent.ScheduledExecutorService r0 = com.bytedance.android.openliveplugin.LivePluginHelper.sExecutor
                com.bytedance.android.openliveplugin.stub.activity.StubActivity$SuperActivity$2 r1 = new com.bytedance.android.openliveplugin.stub.activity.StubActivity$SuperActivity$2
                r1.<init>(r2)
                r0.execute(r1)
                return
        }

        public java.lang.String getPluginPkgName() {
                r1 = this;
                java.lang.String r0 = "com.byted.live.lite"
                return r0
        }

        public void onWindowFocusChanged(boolean r2) {
                r1 = this;
                super.onWindowFocusChanged(r2)
                if (r2 != 0) goto L1e
                android.os.Handler r2 = r1.handler
                if (r2 != 0) goto L14
                android.os.Handler r2 = new android.os.Handler
                android.os.Looper r0 = android.os.Looper.getMainLooper()
                r2.<init>(r0)
                r1.handler = r2
            L14:
                android.os.Handler r2 = r1.handler
                com.bytedance.android.openliveplugin.stub.activity.StubActivity$SuperActivity$1 r0 = new com.bytedance.android.openliveplugin.stub.activity.StubActivity$SuperActivity$1
                r0.<init>(r1)
                r2.post(r0)
            L1e:
                return
        }
    }

    public StubActivity() {
            r0 = this;
            r0.<init>()
            return
    }
}

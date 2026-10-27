package com.autonavi.base.ae.gmap.bean;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.autonavi.base.amap.mapcore.jbinding.JBindingInclude
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class InitStorageParam {
    private static final java.lang.String DIR_NAME = "terrain_dem_files";
    private static final java.lang.String INIT_STORAGE_DIR = "mapcache";

    @com.autonavi.base.amap.mapcore.jbinding.JBindingInclude
    private int maxFileCount;

    @com.autonavi.base.amap.mapcore.jbinding.JBindingInclude
    private long maxFileSize;

    @com.autonavi.base.amap.mapcore.jbinding.JBindingInclude
    private java.lang.String path;

    @com.autonavi.base.amap.mapcore.jbinding.JBindingInclude
    private int version;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class Holder {
        private static java.lang.String sPath;

        public Holder() {
                r0 = this;
                r0.<init>()
                return
        }

        static /* synthetic */ java.lang.String access$000() {
                java.lang.String r0 = com.autonavi.base.ae.gmap.bean.InitStorageParam.Holder.sPath
                return r0
        }

        public static void initPath(java.lang.String r2) {
                java.io.File r0 = new java.io.File
                r0.<init>(r2)
                java.io.File r2 = new java.io.File
                java.lang.String r1 = "mapcache"
                r2.<init>(r0, r1)
                boolean r0 = r0.isDirectory()
                if (r0 == 0) goto L31
                boolean r0 = r2.exists()
                if (r0 != 0) goto L1b
                r2.mkdir()
            L1b:
                java.io.File r0 = new java.io.File
                java.lang.String r1 = "terrain_dem_files"
                r0.<init>(r2, r1)
                boolean r2 = r0.exists()
                if (r2 != 0) goto L2b
                r0.mkdir()
            L2b:
                java.lang.String r2 = r0.getAbsolutePath()
                com.autonavi.base.ae.gmap.bean.InitStorageParam.Holder.sPath = r2
            L31:
                return
        }
    }

    private InitStorageParam() {
            r6 = this;
            java.lang.String r2 = com.autonavi.base.ae.gmap.bean.InitStorageParam.Holder.access$000()
            r3 = 1000(0x3e8, float:1.401E-42)
            r4 = 300000(0x493e0, double:1.482197E-318)
            r1 = 1
            r0 = r6
            r0.<init>(r1, r2, r3, r4)
            return
    }

    private InitStorageParam(int r1, java.lang.String r2, int r3, long r4) {
            r0 = this;
            r0.<init>()
            r0.version = r1
            r0.path = r2
            r0.maxFileCount = r3
            r0.maxFileSize = r4
            return
    }

    @com.autonavi.base.amap.mapcore.jbinding.JBindingInclude
    public static com.autonavi.base.ae.gmap.bean.InitStorageParam obtain() {
            com.autonavi.base.ae.gmap.bean.InitStorageParam r0 = new com.autonavi.base.ae.gmap.bean.InitStorageParam
            r0.<init>()
            return r0
    }

    @com.autonavi.base.amap.mapcore.jbinding.JBindingInclude
    public static com.autonavi.base.ae.gmap.bean.InitStorageParam obtain(int r6, java.lang.String r7, int r8, long r9) {
            com.autonavi.base.ae.gmap.bean.InitStorageParam r0 = new com.autonavi.base.ae.gmap.bean.InitStorageParam
            r1 = r6
            r2 = r7
            r3 = r8
            r4 = r9
            r0.<init>(r1, r2, r3, r4)
            return r0
    }

    @com.autonavi.base.amap.mapcore.jbinding.JBindingInclude
    public int getMaxFileCount() {
            r1 = this;
            int r0 = r1.maxFileCount
            return r0
    }

    @com.autonavi.base.amap.mapcore.jbinding.JBindingInclude
    public long getMaxFileSize() {
            r2 = this;
            long r0 = r2.maxFileSize
            return r0
    }

    @com.autonavi.base.amap.mapcore.jbinding.JBindingInclude
    public java.lang.String getPath() {
            r1 = this;
            java.lang.String r0 = r1.path
            return r0
    }

    @com.autonavi.base.amap.mapcore.jbinding.JBindingInclude
    public int getVersion() {
            r1 = this;
            int r0 = r1.version
            return r0
    }

    @com.autonavi.base.amap.mapcore.jbinding.JBindingInclude
    public void setMaxFileCount(int r1) {
            r0 = this;
            r0.maxFileCount = r1
            return
    }

    @com.autonavi.base.amap.mapcore.jbinding.JBindingInclude
    public void setMaxFileSize(long r1) {
            r0 = this;
            r0.maxFileSize = r1
            return
    }

    @com.autonavi.base.amap.mapcore.jbinding.JBindingInclude
    public void setPath(java.lang.String r1) {
            r0 = this;
            r0.path = r1
            return
    }

    @com.autonavi.base.amap.mapcore.jbinding.JBindingInclude
    public void setVersion(int r1) {
            r0 = this;
            r0.version = r1
            return
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "InitStorageParam{version="
            r0.<init>(r1)
            int r1 = r3.version
            r0.append(r1)
            java.lang.String r1 = ", maxFileCount="
            r0.append(r1)
            int r1 = r3.maxFileCount
            r0.append(r1)
            java.lang.String r1 = ", maxFileSize="
            r0.append(r1)
            long r1 = r3.maxFileSize
            r0.append(r1)
            java.lang.String r1 = ", path='"
            r0.append(r1)
            java.lang.String r1 = r3.path
            r0.append(r1)
            r1 = 39
            r0.append(r1)
            r1 = 125(0x7d, float:1.75E-43)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}

package com.bytedance.pangle.ae;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
public class j extends com.bytedance.pangle.cw.j {
    private static volatile com.bytedance.pangle.ae.j j;

    public j() {
            r0 = this;
            r0.<init>()
            return
    }

    public static com.bytedance.pangle.ae.j xt() {
            com.bytedance.pangle.ae.j r0 = com.bytedance.pangle.ae.j.j
            if (r0 != 0) goto L19
            java.lang.Class<com.bytedance.pangle.ae.j> r0 = com.bytedance.pangle.ae.j.class
            monitor-enter(r0)
            com.bytedance.pangle.ae.j r1 = com.bytedance.pangle.ae.j.j     // Catch: java.lang.Throwable -> L13
            if (r1 != 0) goto L15
            com.bytedance.pangle.ae.j r1 = new com.bytedance.pangle.ae.j     // Catch: java.lang.Throwable -> L13
            r1.<init>()     // Catch: java.lang.Throwable -> L13
            com.bytedance.pangle.ae.j.j = r1     // Catch: java.lang.Throwable -> L13
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
            com.bytedance.pangle.ae.j r0 = com.bytedance.pangle.ae.j.j
            return r0
    }

    @Override // com.bytedance.pangle.cw
    public void j(int r5) throws android.os.RemoteException {
            r4 = this;
            com.bytedance.pangle.oq r0 = com.bytedance.pangle.oq.j()
            java.util.List r0 = r0.cw()
            java.util.Iterator r1 = r0.iterator()
        Lc:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L26
            java.lang.Object r2 = r1.next()
            com.bytedance.pangle.ZeusPluginStateListener r2 = (com.bytedance.pangle.ZeusPluginStateListener) r2
            boolean r3 = r2 instanceof com.bytedance.pangle.ae.cw
            if (r3 == 0) goto Lc
            r3 = r2
            com.bytedance.pangle.ae.cw r3 = (com.bytedance.pangle.ae.cw) r3
            int r3 = r3.j()
            if (r3 != r5) goto Lc
            goto L27
        L26:
            r2 = 0
        L27:
            if (r2 == 0) goto L2c
            r0.remove(r2)
        L2c:
            return
    }

    @Override // com.bytedance.pangle.cw
    public void j(int r2, com.bytedance.pangle.r r3) throws android.os.RemoteException {
            r1 = this;
            com.bytedance.pangle.ae.cw r0 = new com.bytedance.pangle.ae.cw
            r0.<init>(r3, r2)
            com.bytedance.pangle.Zeus.registerPluginStateListener(r0)
            return
    }

    @Override // com.bytedance.pangle.cw
    public boolean j(java.lang.String r2) {
            r1 = this;
            com.bytedance.pangle.plugin.PluginManager r0 = com.bytedance.pangle.plugin.PluginManager.getInstance()
            boolean r2 = r0.checkPluginInstalled(r2)
            return r2
    }

    @Override // com.bytedance.pangle.cw
    public boolean j(java.lang.String r4, java.lang.String r5) {
            r3 = this;
            com.bytedance.pangle.GlobalParam r0 = com.bytedance.pangle.GlobalParam.getInstance()
            com.bytedance.pangle.log.IZeusReporter r0 = r0.getReporter()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "start install pkg:"
            r1.<init>(r2)
            r1.append(r4)
            java.lang.String r2 = ", path:"
            r1.append(r2)
            r1.append(r5)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "zeus_stage_plugin_install"
            r0.saveRecord(r2, r1)
            com.bytedance.pangle.plugin.PluginManager r0 = com.bytedance.pangle.plugin.PluginManager.getInstance()
            java.io.File r1 = new java.io.File
            r1.<init>(r5)
            boolean r4 = r0.syncInstall(r4, r1)
            return r4
    }

    @Override // com.bytedance.pangle.cw
    public int xt(java.lang.String r2) {
            r1 = this;
            com.bytedance.pangle.plugin.PluginManager r0 = com.bytedance.pangle.plugin.PluginManager.getInstance()
            com.bytedance.pangle.plugin.Plugin r2 = r0.getPlugin(r2)
            int r2 = r2.getVersion()
            return r2
    }
}

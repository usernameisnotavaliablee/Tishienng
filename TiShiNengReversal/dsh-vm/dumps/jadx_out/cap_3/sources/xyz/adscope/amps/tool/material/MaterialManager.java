package xyz.adscope.amps.tool.material;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class MaterialManager {
    private android.view.View currentView;
    private xyz.adscope.amps.model.material.AMPSUploadMaterial mAMPSUploadMaterial;
    private android.content.Context viewContext;



    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private class ImageFileFilter implements java.io.FileFilter {
        final /* synthetic */ xyz.adscope.amps.tool.material.MaterialManager this$0;
        private final java.lang.String[] validExtensions;

        private ImageFileFilter(xyz.adscope.amps.tool.material.MaterialManager r7) {
                r6 = this;
                r6.this$0 = r7
                r6.<init>()
                java.lang.String r4 = ".gif"
                java.lang.String r5 = ".bmp"
                java.lang.String r0 = ".jpg"
                java.lang.String r1 = ".jpeg"
                java.lang.String r2 = ".png"
                java.lang.String r3 = ".webp"
                java.lang.String[] r7 = new java.lang.String[]{r0, r1, r2, r3, r4, r5}
                r6.validExtensions = r7
                return
        }

        /* synthetic */ ImageFileFilter(xyz.adscope.amps.tool.material.MaterialManager r1, xyz.adscope.amps.tool.material.MaterialManager.AnonymousClass1 r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // java.io.FileFilter
        public boolean accept(java.io.File r6) {
                r5 = this;
                r0 = 0
                if (r6 == 0) goto L25
                boolean r1 = r6.isFile()
                if (r1 != 0) goto La
                goto L25
            La:
                java.lang.String r6 = r6.getName()
                java.lang.String r6 = r6.toLowerCase()
                java.lang.String[] r1 = r5.validExtensions
                int r2 = r1.length
                r3 = 0
            L16:
                if (r3 >= r2) goto L25
                r4 = r1[r3]
                boolean r4 = r6.endsWith(r4)
                if (r4 == 0) goto L22
                r6 = 1
                return r6
            L22:
                int r3 = r3 + 1
                goto L16
            L25:
                return r0
        }
    }

    public MaterialManager(android.content.Context r1, android.view.View r2, xyz.adscope.amps.model.material.AMPSUploadMaterial r3) {
            r0 = this;
            r0.<init>()
            r0.viewContext = r1
            r0.currentView = r2
            r0.mAMPSUploadMaterial = r3
            return
    }

    static /* synthetic */ android.content.Context access$000(xyz.adscope.amps.tool.material.MaterialManager r0) {
            android.content.Context r0 = r0.viewContext
            return r0
    }

    static /* synthetic */ android.view.View access$100(xyz.adscope.amps.tool.material.MaterialManager r0) {
            android.view.View r0 = r0.currentView
            return r0
    }

    static /* synthetic */ xyz.adscope.amps.model.material.AMPSUploadMaterial access$200(xyz.adscope.amps.tool.material.MaterialManager r0) {
            xyz.adscope.amps.model.material.AMPSUploadMaterial r0 = r0.mAMPSUploadMaterial
            return r0
    }

    static /* synthetic */ void access$300(xyz.adscope.amps.tool.material.MaterialManager r0, java.lang.String r1, java.io.File r2, java.lang.String r3, xyz.adscope.amps.model.material.AMPSUploadMaterial r4) {
            r0.uploadImgFile(r1, r2, r3, r4)
            return
    }

    private void uploadImgFile(java.lang.String r3, java.io.File r4, java.lang.String r5, xyz.adscope.amps.model.material.AMPSUploadMaterial r6) {
            r2 = this;
            java.lang.String r0 = xyz.adscope.amps.tool.util.AMPSStringUtil.createRequestId()
            r6.setEventId(r0)
            long r0 = java.lang.System.currentTimeMillis()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r6.setEventTime(r0)
            r6.setMaterialMD5(r5)
            if (r4 == 0) goto L28
            boolean r5 = r4.exists()
            if (r5 == 0) goto L28
            byte[] r4 = xyz.adscope.amps.tool.util.AMPSFileUtils.fileToByteArray(r4)
            java.lang.String r4 = xyz.adscope.common.v2.encrypt.impl.Base64Util.encodeToString(r4)
            r6.setMaterialData(r4)
        L28:
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r4.add(r6)
            r2.uploadService(r3, r4)
            return
    }

    private void uploadService(java.lang.String r6, java.util.List<xyz.adscope.amps.model.material.AMPSUploadMaterial> r7) {
            r5 = this;
            org.json.JSONArray r0 = xyz.adscope.common.v2.tool.json.JsonUtil.emptyJSONArray()
            java.util.Iterator r7 = r7.iterator()
        L8:
            boolean r1 = r7.hasNext()
            r2 = 1
            if (r1 == 0) goto L1d
            java.lang.Object r1 = r7.next()
            xyz.adscope.amps.model.material.AMPSUploadMaterial r1 = (xyz.adscope.amps.model.material.AMPSUploadMaterial) r1
            org.json.JSONObject r1 = xyz.adscope.common.v2.tool.json.JsonUtil.entry2JsonObject(r1, r2)
            r0.put(r1)
            goto L8
        L1d:
            java.lang.String r7 = r0.toString()
            android.content.Context r0 = xyz.adscope.amps.AMPSSDK.getContext()
            xyz.adscope.common.v2.conn.IBaseEncryptRequest r1 = new xyz.adscope.common.v2.conn.IBaseEncryptRequest
            r1.<init>(r0, r2)
            xyz.adscope.amps.manager.AMPSSDKManager r2 = xyz.adscope.amps.manager.AMPSSDKManager.getInstance()
            xyz.adscope.amps.init.inter.IAMPSInitInterface r2 = r2.getIAMPSInitInterface()
            xyz.adscope.amps.model.AMPSGlobalModel r2 = r2.getGlobalModel()
            xyz.adscope.amps.model.config.response.AMPSConfigResponseModel r2 = r2.getConfigureResponseModel()
            xyz.adscope.amps.model.config.response.LogStrategyModel r2 = r2.getLogStrategy()
            if (r2 == 0) goto L64
            java.lang.String r2 = r2.getAcceptEncrypt()
            r1.setEncryptPatten(r2)
            xyz.adscope.common.v2.encrypt.LinkedEncryptManager r3 = xyz.adscope.common.v2.encrypt.LinkedEncryptManager.getInstance()
            java.lang.Object r0 = r3.getOrCreateImplement(r0)
            xyz.adscope.common.v2.encrypt.ILinkedEncrypt r0 = (xyz.adscope.common.v2.encrypt.ILinkedEncrypt) r0
            byte[] r7 = r7.getBytes()
            xyz.adscope.common.v2.encrypt.ILinkedEncrypt$B64Model r3 = xyz.adscope.common.v2.encrypt.ILinkedEncrypt.B64Model.NOT_APPEND
            r4 = 0
            byte[] r7 = r0.encrypt(r7, r2, r3, r4)
            xyz.adscope.amps.tool.material.MaterialManager$2 r0 = new xyz.adscope.amps.tool.material.MaterialManager$2
            r0.<init>(r5)
            r1.requestWithStreamMethod(r6, r7, r0)
        L64:
            return
    }

    public java.lang.String findLikeImg(java.lang.String r12, android.graphics.Bitmap r13, float r14, long r15) {
            r11 = this;
            java.io.File r0 = new java.io.File
            r0.<init>(r12)
            boolean r12 = r0.exists()
            java.lang.String r1 = ""
            if (r12 == 0) goto L8a
            boolean r12 = r0.isDirectory()
            if (r12 != 0) goto L15
            goto L8a
        L15:
            xyz.adscope.amps.tool.material.MaterialManager$ImageFileFilter r12 = new xyz.adscope.amps.tool.material.MaterialManager$ImageFileFilter
            r2 = 0
            r12.<init>(r11, r2)
            java.io.File[] r12 = r0.listFiles(r12)
            if (r12 == 0) goto L8a
            int r0 = r12.length
            if (r0 != 0) goto L26
            goto L8a
        L26:
            long r3 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L73 java.lang.Exception -> L76
            int r0 = r12.length     // Catch: java.lang.Throwable -> L73 java.lang.Exception -> L76
            r5 = 0
            r6 = r2
        L2d:
            if (r5 >= r0) goto L78
            r7 = r12[r5]     // Catch: java.lang.Throwable -> L45 java.lang.Exception -> L49
            long r8 = r7.lastModified()     // Catch: java.lang.Throwable -> L4c
            long r8 = r3 - r8
            int r10 = (r8 > r15 ? 1 : (r8 == r15 ? 0 : -1))
            if (r10 <= 0) goto L4f
            r7.delete()     // Catch: java.lang.Throwable -> L4c
            if (r6 == 0) goto L68
        L40:
            r6.recycle()     // Catch: java.lang.Throwable -> L45 java.lang.Exception -> L49
            r6 = r2
            goto L68
        L45:
            r0 = move-exception
            r12 = r0
            r2 = r6
            goto L7f
        L49:
            r2 = r6
            goto L85
        L4c:
            r0 = move-exception
            r12 = r0
            goto L6b
        L4f:
            android.graphics.Bitmap r6 = xyz.adscope.amps.tool.util.APMSImageUtils.decodeSampledBitmap(r7)     // Catch: java.lang.Throwable -> L4c
            if (r6 != 0) goto L58
            if (r6 == 0) goto L68
            goto L40
        L58:
            float r8 = xyz.adscope.amps.tool.util.APMSImageUtils.calculateSimilarityFast(r13, r6)     // Catch: java.lang.Throwable -> L4c
            int r8 = (r8 > r14 ? 1 : (r8 == r14 ? 0 : -1))
            if (r8 < 0) goto L40
            java.lang.String r1 = r7.getName()     // Catch: java.lang.Throwable -> L4c
            r6.recycle()     // Catch: java.lang.Throwable -> L45 java.lang.Exception -> L49
            goto L79
        L68:
            int r5 = r5 + 1
            goto L2d
        L6b:
            if (r6 == 0) goto L71
            r6.recycle()     // Catch: java.lang.Throwable -> L45 java.lang.Exception -> L49
            goto L72
        L71:
            r2 = r6
        L72:
            throw r12     // Catch: java.lang.Throwable -> L73 java.lang.Exception -> L76
        L73:
            r0 = move-exception
            r12 = r0
            goto L7f
        L76:
            goto L85
        L78:
            r2 = r6
        L79:
            if (r2 == 0) goto L7e
            r2.recycle()
        L7e:
            return r1
        L7f:
            if (r2 == 0) goto L84
            r2.recycle()
        L84:
            throw r12
        L85:
            if (r2 == 0) goto L8a
            r2.recycle()
        L8a:
            return r1
    }

    public void saveMaterial() {
            r4 = this;
            xyz.adscope.amps.manager.AMPSSDKManager r0 = xyz.adscope.amps.manager.AMPSSDKManager.getInstance()
            xyz.adscope.amps.init.inter.IAMPSInitInterface r0 = r0.getIAMPSInitInterface()
            xyz.adscope.amps.model.AMPSGlobalModel r0 = r0.getGlobalModel()
            xyz.adscope.amps.model.config.response.AMPSConfigResponseModel r0 = r0.getConfigureResponseModel()
            xyz.adscope.amps.model.config.response.MaterialManagerModel r0 = r0.getMaterialManager()
            android.view.View r1 = r4.currentView
            if (r1 != 0) goto L31
            android.app.Activity r1 = xyz.adscope.amps.tool.hook.AMPSHookActivity.getTopActivity()
            if (r1 == 0) goto L31
            android.view.Window r2 = r1.getWindow()
            android.view.View r2 = r2.getDecorView()
            r3 = 16908290(0x1020002, float:2.3877235E-38)
            android.view.View r2 = r2.findViewById(r3)
            r4.currentView = r2
            r4.viewContext = r1
        L31:
            android.view.View r1 = r4.currentView
            if (r1 != 0) goto L36
            return
        L36:
            java.util.concurrent.ThreadPoolExecutor r1 = xyz.adscope.amps.tool.thread.AMPSThreadPool.getInitRequestPool()
            xyz.adscope.amps.tool.material.MaterialManager$1 r2 = new xyz.adscope.amps.tool.material.MaterialManager$1
            r2.<init>(r4, r0)
            r1.execute(r2)
            return
    }
}

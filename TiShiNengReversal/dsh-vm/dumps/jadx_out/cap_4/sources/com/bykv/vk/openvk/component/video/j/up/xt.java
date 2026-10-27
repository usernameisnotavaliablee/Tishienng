package com.bykv.vk.openvk.component.video.j.up;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class xt {

    public static class j extends com.bytedance.sdk.component.oq.r.xt<java.lang.String, java.lang.Integer, android.graphics.Bitmap> {
        private long cw;
        private com.bykv.vk.openvk.component.video.j.up.xt.InterfaceC0177xt xt;

        public j(com.bykv.vk.openvk.component.video.j.up.xt.InterfaceC0177xt r1, long r2) {
                r0 = this;
                r0.<init>()
                r0.xt = r1
                r0.cw = r2
                return
        }

        protected /* synthetic */ java.lang.Object doInBackground(java.lang.Object[] r1) {
                r0 = this;
                java.lang.String[] r1 = (java.lang.String[]) r1
                android.graphics.Bitmap r1 = r0.j(r1)
                return r1
        }

        protected android.graphics.Bitmap j(java.lang.String... r7) {
                r6 = this;
                r0 = 0
                android.media.MediaMetadataRetriever r1 = new android.media.MediaMetadataRetriever     // Catch: java.lang.Throwable -> L1a
                r1.<init>()     // Catch: java.lang.Throwable -> L1a
                r2 = 0
                r7 = r7[r2]     // Catch: java.lang.Throwable -> L1a
                java.lang.String r2 = "http"
                boolean r2 = r7.startsWith(r2)     // Catch: java.lang.Throwable -> L1a
                if (r2 == 0) goto L1c
                java.util.HashMap r2 = new java.util.HashMap     // Catch: java.lang.Throwable -> L1a
                r2.<init>()     // Catch: java.lang.Throwable -> L1a
                r1.setDataSource(r7, r2)     // Catch: java.lang.Throwable -> L1a
                goto L1f
            L1a:
                r7 = move-exception
                goto L2e
            L1c:
                r1.setDataSource(r7)     // Catch: java.lang.Throwable -> L1a
            L1f:
                long r2 = r6.cw     // Catch: java.lang.Throwable -> L1a
                r4 = 1000(0x3e8, double:4.94E-321)
                long r2 = r2 * r4
                r7 = 3
                android.graphics.Bitmap r0 = r1.getFrameAtTime(r2, r7)     // Catch: java.lang.Throwable -> L1a
                r1.release()     // Catch: java.lang.Throwable -> L1a
                return r0
            L2e:
                java.lang.String r1 = "MediaUtils"
                java.lang.String r2 = "MediaUtils doInBackground : "
                com.bykv.vk.openvk.component.video.api.m.cw.cw(r1, r2, r7)
                return r0
        }

        protected void j(android.graphics.Bitmap r2) {
                r1 = this;
                super/*android.os.AsyncTask*/.onPostExecute(r2)
                com.bykv.vk.openvk.component.video.j.up.xt$xt r0 = r1.xt
                if (r0 == 0) goto La
                r0.j(r2)
            La:
                return
        }

        protected /* synthetic */ void onPostExecute(java.lang.Object r1) {
                r0 = this;
                android.graphics.Bitmap r1 = (android.graphics.Bitmap) r1
                r0.j(r1)
                return
        }
    }

    /* renamed from: com.bykv.vk.openvk.component.video.j.up.xt$xt, reason: collision with other inner class name */
    public interface InterfaceC0177xt {
        void j(android.graphics.Bitmap r1);
    }

    public xt() {
            r1 = this;
            r1.<init>()
            return
    }

    public static void j(long r1, java.lang.String r3, com.bykv.vk.openvk.component.video.j.up.xt.InterfaceC0177xt r4) {
            com.bykv.vk.openvk.component.video.j.up.xt$j r0 = new com.bykv.vk.openvk.component.video.j.up.xt$j
            r0.<init>(r4, r1)
            java.lang.String[] r1 = new java.lang.String[]{r3}
            r0.j(r1)
            return
    }
}

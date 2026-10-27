package com.acse.ottn.model;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class IntegralModel {
    private java.util.List<com.acse.ottn.model.IntegralModel.PointsListBean> points_list;
    private int r;
    private java.lang.String total_points;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class PointsListBean {
        private java.lang.String ctime;
        private java.lang.String des;
        private java.lang.String points;
        private java.lang.String status;

        public PointsListBean() {
                r0 = this;
                r0.<init>()
                return
        }

        public java.lang.String getCtime() {
                r1 = this;
                java.lang.String r0 = r1.ctime
                return r0
        }

        public java.lang.String getDes() {
                r1 = this;
                java.lang.String r0 = r1.des
                return r0
        }

        public java.lang.String getPoints() {
                r1 = this;
                java.lang.String r0 = r1.points
                return r0
        }

        public java.lang.String getStatus() {
                r1 = this;
                java.lang.String r0 = r1.status
                return r0
        }

        public void setCtime(java.lang.String r1) {
                r0 = this;
                r0.ctime = r1
                return
        }

        public void setDes(java.lang.String r1) {
                r0 = this;
                r0.des = r1
                return
        }

        public void setPoints(java.lang.String r1) {
                r0 = this;
                r0.points = r1
                return
        }

        public void setStatus(java.lang.String r1) {
                r0 = this;
                r0.status = r1
                return
        }

        public java.lang.String toString() {
                r3 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "PointsListBean{des='"
                r0.append(r1)
                java.lang.String r1 = r3.des
                r0.append(r1)
                r1 = 39
                r0.append(r1)
                java.lang.String r2 = ", ctime='"
                r0.append(r2)
                java.lang.String r2 = r3.ctime
                r0.append(r2)
                r0.append(r1)
                java.lang.String r2 = ", points='"
                r0.append(r2)
                java.lang.String r2 = r3.points
                r0.append(r2)
                r0.append(r1)
                java.lang.String r2 = ", status='"
                r0.append(r2)
                java.lang.String r2 = r3.status
                r0.append(r2)
                r0.append(r1)
                r1 = 125(0x7d, float:1.75E-43)
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    public IntegralModel() {
            r0 = this;
            r0.<init>()
            return
    }

    public java.util.List<com.acse.ottn.model.IntegralModel.PointsListBean> getPoints_list() {
            r1 = this;
            java.util.List<com.acse.ottn.model.IntegralModel$PointsListBean> r0 = r1.points_list
            return r0
    }

    public int getR() {
            r1 = this;
            int r0 = r1.r
            return r0
    }

    public java.lang.String getTotal_points() {
            r1 = this;
            java.lang.String r0 = r1.total_points
            return r0
    }

    public void setPoints_list(java.util.List<com.acse.ottn.model.IntegralModel.PointsListBean> r1) {
            r0 = this;
            r0.points_list = r1
            return
    }

    public void setR(int r1) {
            r0 = this;
            r0.r = r1
            return
    }

    public void setTotal_points(java.lang.String r1) {
            r0 = this;
            r0.total_points = r1
            return
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "IntegralModel{r="
            r0.append(r1)
            int r1 = r2.r
            r0.append(r1)
            java.lang.String r1 = ", total_points='"
            r0.append(r1)
            java.lang.String r1 = r2.total_points
            r0.append(r1)
            r1 = 39
            r0.append(r1)
            java.lang.String r1 = ", points_list="
            r0.append(r1)
            java.util.List<com.acse.ottn.model.IntegralModel$PointsListBean> r1 = r2.points_list
            r0.append(r1)
            r1 = 125(0x7d, float:1.75E-43)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}

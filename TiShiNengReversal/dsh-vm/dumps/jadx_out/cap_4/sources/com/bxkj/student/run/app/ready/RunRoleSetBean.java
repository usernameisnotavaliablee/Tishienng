package com.bxkj.student.run.app.ready;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class RunRoleSetBean implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.bxkj.student.run.app.ready.RunRoleSetBean> CREATOR = null;
    private com.bxkj.student.run.app.ready.RunRoleSetBean.DataBean data;
    private java.lang.String returnCode;
    private java.lang.String returnMsg;


    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class DataBean implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<com.bxkj.student.run.app.ready.RunRoleSetBean.DataBean> CREATOR = null;
        private java.lang.String context;
        private double faceDistanceOut;
        private int faceTimeout;
        private java.util.List<java.util.List<com.bxkj.student.run.app.ready.RunRoleSetBean.DataBean.GeofenceBean>> geofence;
        private java.lang.String identify;
        private int isClock;
        private int isEndFace;
        private int isQuestion;
        private int isStartFace;
        private java.util.List<com.bxkj.student.run.app.ready.RunRoleSetBean.DataBean.ListBean> list;
        private java.util.List<java.lang.Double> middleFaces;
        private int pattern;
        private int runType;
        private int surplusNum;
        private double totalRange;


        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        public static class GeofenceBean implements android.os.Parcelable {
            public static final android.os.Parcelable.Creator<com.bxkj.student.run.app.ready.RunRoleSetBean.DataBean.GeofenceBean> CREATOR = null;
            private java.lang.String lat;
            private java.lang.String lng;


            static {
                    com.bxkj.student.run.app.ready.RunRoleSetBean$DataBean$GeofenceBean$1 r0 = new com.bxkj.student.run.app.ready.RunRoleSetBean$DataBean$GeofenceBean$1
                    r0.<init>()
                    com.bxkj.student.run.app.ready.RunRoleSetBean.DataBean.GeofenceBean.CREATOR = r0
                    return
            }

            public GeofenceBean() {
                    r0 = this;
                    r0.<init>()
                    return
            }

            protected GeofenceBean(android.os.Parcel r2) {
                    r1 = this;
                    r1.<init>()
                    java.lang.String r0 = r2.readString()
                    r1.lng = r0
                    java.lang.String r2 = r2.readString()
                    r1.lat = r2
                    return
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                    r1 = this;
                    r0 = 0
                    return r0
            }

            public java.lang.String getLat() {
                    r1 = this;
                    java.lang.String r0 = r1.lat
                    return r0
            }

            public java.lang.String getLng() {
                    r1 = this;
                    java.lang.String r0 = r1.lng
                    return r0
            }

            public void setLat(java.lang.String r1) {
                    r0 = this;
                    r0.lat = r1
                    return
            }

            public void setLng(java.lang.String r1) {
                    r0 = this;
                    r0.lng = r1
                    return
            }

            @Override // android.os.Parcelable
            public void writeToParcel(android.os.Parcel r1, int r2) {
                    r0 = this;
                    java.lang.String r2 = r0.lng
                    r1.writeString(r2)
                    java.lang.String r2 = r0.lat
                    r1.writeString(r2)
                    return
            }
        }

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        public static class ListBean implements android.os.Parcelable {
            public static final android.os.Parcelable.Creator<com.bxkj.student.run.app.ready.RunRoleSetBean.DataBean.ListBean> CREATOR = null;
            private java.lang.String content;
            private int id;
            private int isMustPoint;
            private java.lang.String latitude;
            private java.lang.String longitude;
            private int okRadius;


            static {
                    com.bxkj.student.run.app.ready.RunRoleSetBean$DataBean$ListBean$1 r0 = new com.bxkj.student.run.app.ready.RunRoleSetBean$DataBean$ListBean$1
                    r0.<init>()
                    com.bxkj.student.run.app.ready.RunRoleSetBean.DataBean.ListBean.CREATOR = r0
                    return
            }

            public ListBean() {
                    r0 = this;
                    r0.<init>()
                    return
            }

            protected ListBean(android.os.Parcel r2) {
                    r1 = this;
                    r1.<init>()
                    int r0 = r2.readInt()
                    r1.id = r0
                    java.lang.String r0 = r2.readString()
                    r1.latitude = r0
                    java.lang.String r0 = r2.readString()
                    r1.longitude = r0
                    java.lang.String r0 = r2.readString()
                    r1.content = r0
                    int r0 = r2.readInt()
                    r1.okRadius = r0
                    int r2 = r2.readInt()
                    r1.isMustPoint = r2
                    return
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                    r1 = this;
                    r0 = 0
                    return r0
            }

            public java.lang.String getContent() {
                    r1 = this;
                    java.lang.String r0 = r1.content
                    return r0
            }

            public int getId() {
                    r1 = this;
                    int r0 = r1.id
                    return r0
            }

            public int getIsMustPoint() {
                    r1 = this;
                    int r0 = r1.isMustPoint
                    return r0
            }

            public java.lang.String getLatitude() {
                    r1 = this;
                    java.lang.String r0 = r1.latitude
                    return r0
            }

            public java.lang.String getLongitude() {
                    r1 = this;
                    java.lang.String r0 = r1.longitude
                    return r0
            }

            public int getOkRadius() {
                    r1 = this;
                    int r0 = r1.okRadius
                    return r0
            }

            public void setContent(java.lang.String r1) {
                    r0 = this;
                    r0.content = r1
                    return
            }

            public void setId(int r1) {
                    r0 = this;
                    r0.id = r1
                    return
            }

            public void setIsMustPoint(int r1) {
                    r0 = this;
                    r0.isMustPoint = r1
                    return
            }

            public void setLatitude(java.lang.String r1) {
                    r0 = this;
                    r0.latitude = r1
                    return
            }

            public void setLongitude(java.lang.String r1) {
                    r0 = this;
                    r0.longitude = r1
                    return
            }

            public void setOkRadius(int r1) {
                    r0 = this;
                    r0.okRadius = r1
                    return
            }

            @Override // android.os.Parcelable
            public void writeToParcel(android.os.Parcel r1, int r2) {
                    r0 = this;
                    int r2 = r0.id
                    r1.writeInt(r2)
                    java.lang.String r2 = r0.latitude
                    r1.writeString(r2)
                    java.lang.String r2 = r0.longitude
                    r1.writeString(r2)
                    java.lang.String r2 = r0.content
                    r1.writeString(r2)
                    int r2 = r0.okRadius
                    r1.writeInt(r2)
                    int r2 = r0.isMustPoint
                    r1.writeInt(r2)
                    return
            }
        }

        static {
                com.bxkj.student.run.app.ready.RunRoleSetBean$DataBean$1 r0 = new com.bxkj.student.run.app.ready.RunRoleSetBean$DataBean$1
                r0.<init>()
                com.bxkj.student.run.app.ready.RunRoleSetBean.DataBean.CREATOR = r0
                return
        }

        public DataBean() {
                r1 = this;
                r1.<init>()
                r0 = 0
                r1.isQuestion = r0
                return
        }

        protected DataBean(android.os.Parcel r3) {
                r2 = this;
                r2.<init>()
                r0 = 0
                r2.isQuestion = r0
                int r0 = r3.readInt()
                r2.runType = r0
                int r0 = r3.readInt()
                r2.isStartFace = r0
                int r0 = r3.readInt()
                r2.isEndFace = r0
                int r0 = r3.readInt()
                r2.isQuestion = r0
                int r0 = r3.readInt()
                r2.isClock = r0
                double r0 = r3.readDouble()
                r2.totalRange = r0
                java.lang.String r0 = r3.readString()
                r2.identify = r0
                int r0 = r3.readInt()
                r2.faceTimeout = r0
                double r0 = r3.readDouble()
                r2.faceDistanceOut = r0
                int r0 = r3.readInt()
                r2.pattern = r0
                java.lang.String r0 = r3.readString()
                r2.context = r0
                int r0 = r3.readInt()
                r2.surplusNum = r0
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r2.middleFaces = r0
                java.lang.Class<java.lang.Double> r1 = java.lang.Double.class
                java.lang.ClassLoader r1 = r1.getClassLoader()
                r3.readList(r0, r1)
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r2.list = r0
                java.lang.Class<com.bxkj.student.run.app.ready.RunRoleSetBean$DataBean$ListBean> r1 = com.bxkj.student.run.app.ready.RunRoleSetBean.DataBean.ListBean.class
                java.lang.ClassLoader r1 = r1.getClassLoader()
                r3.readList(r0, r1)
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r2.geofence = r0
                java.lang.Class<com.bxkj.student.run.app.ready.RunRoleSetBean$DataBean$GeofenceBean> r1 = com.bxkj.student.run.app.ready.RunRoleSetBean.DataBean.GeofenceBean.class
                java.lang.ClassLoader r1 = r1.getClassLoader()
                r3.readList(r0, r1)
                return
        }

        @Override // android.os.Parcelable
        public int describeContents() {
                r1 = this;
                r0 = 0
                return r0
        }

        public java.lang.String getContext() {
                r1 = this;
                java.lang.String r0 = r1.context
                return r0
        }

        public double getFaceDistanceOut() {
                r2 = this;
                double r0 = r2.faceDistanceOut
                return r0
        }

        public int getFaceTimeout() {
                r1 = this;
                int r0 = r1.faceTimeout
                return r0
        }

        public java.util.List<java.util.List<com.bxkj.student.run.app.ready.RunRoleSetBean.DataBean.GeofenceBean>> getGeofence() {
                r1 = this;
                java.util.List<java.util.List<com.bxkj.student.run.app.ready.RunRoleSetBean$DataBean$GeofenceBean>> r0 = r1.geofence
                return r0
        }

        public java.lang.String getIdentify() {
                r1 = this;
                java.lang.String r0 = r1.identify
                return r0
        }

        public int getIsClock() {
                r1 = this;
                int r0 = r1.isClock
                return r0
        }

        public int getIsEndFace() {
                r1 = this;
                int r0 = r1.isEndFace
                return r0
        }

        public int getIsQuestion() {
                r1 = this;
                int r0 = r1.isQuestion
                return r0
        }

        public int getIsStartFace() {
                r1 = this;
                int r0 = r1.isStartFace
                return r0
        }

        public java.util.List<com.bxkj.student.run.app.ready.RunRoleSetBean.DataBean.ListBean> getList() {
                r1 = this;
                java.util.List<com.bxkj.student.run.app.ready.RunRoleSetBean$DataBean$ListBean> r0 = r1.list
                return r0
        }

        public java.util.List<java.lang.Double> getMiddleFaces() {
                r1 = this;
                java.util.List<java.lang.Double> r0 = r1.middleFaces
                return r0
        }

        public int getPattern() {
                r1 = this;
                int r0 = r1.pattern
                return r0
        }

        public int getRunType() {
                r1 = this;
                int r0 = r1.runType
                return r0
        }

        public int getSurplusNum() {
                r1 = this;
                int r0 = r1.surplusNum
                return r0
        }

        public double getTotalRange() {
                r2 = this;
                double r0 = r2.totalRange
                return r0
        }

        public void setContext(java.lang.String r1) {
                r0 = this;
                r0.context = r1
                return
        }

        public void setFaceDistanceOut(double r1) {
                r0 = this;
                r0.faceDistanceOut = r1
                return
        }

        public void setFaceTimeout(int r1) {
                r0 = this;
                r0.faceTimeout = r1
                return
        }

        public void setGeofence(java.util.List<java.util.List<com.bxkj.student.run.app.ready.RunRoleSetBean.DataBean.GeofenceBean>> r1) {
                r0 = this;
                r0.geofence = r1
                return
        }

        public void setIdentify(java.lang.String r1) {
                r0 = this;
                r0.identify = r1
                return
        }

        public void setIsClock(int r1) {
                r0 = this;
                r0.isClock = r1
                return
        }

        public void setIsEndFace(int r1) {
                r0 = this;
                r0.isEndFace = r1
                return
        }

        public com.bxkj.student.run.app.ready.RunRoleSetBean.DataBean setIsQuestion(int r1) {
                r0 = this;
                r0.isQuestion = r1
                return r0
        }

        public void setIsStartFace(int r1) {
                r0 = this;
                r0.isStartFace = r1
                return
        }

        public void setList(java.util.List<com.bxkj.student.run.app.ready.RunRoleSetBean.DataBean.ListBean> r1) {
                r0 = this;
                r0.list = r1
                return
        }

        public void setMiddleFaces(java.util.List<java.lang.Double> r1) {
                r0 = this;
                r0.middleFaces = r1
                return
        }

        public void setPattern(int r1) {
                r0 = this;
                r0.pattern = r1
                return
        }

        public void setRunType(int r1) {
                r0 = this;
                r0.runType = r1
                return
        }

        public void setSurplusNum(int r1) {
                r0 = this;
                r0.surplusNum = r1
                return
        }

        public void setTotalRange(double r1) {
                r0 = this;
                r0.totalRange = r1
                return
        }

        @Override // android.os.Parcelable
        public void writeToParcel(android.os.Parcel r3, int r4) {
                r2 = this;
                int r4 = r2.runType
                r3.writeInt(r4)
                int r4 = r2.isStartFace
                r3.writeInt(r4)
                int r4 = r2.isEndFace
                r3.writeInt(r4)
                int r4 = r2.isQuestion
                r3.writeInt(r4)
                int r4 = r2.isClock
                r3.writeInt(r4)
                double r0 = r2.totalRange
                r3.writeDouble(r0)
                java.lang.String r4 = r2.identify
                r3.writeString(r4)
                int r4 = r2.faceTimeout
                r3.writeInt(r4)
                double r0 = r2.faceDistanceOut
                r3.writeDouble(r0)
                int r4 = r2.pattern
                r3.writeInt(r4)
                java.lang.String r4 = r2.context
                r3.writeString(r4)
                int r4 = r2.surplusNum
                r3.writeInt(r4)
                java.util.List<java.lang.Double> r4 = r2.middleFaces
                r3.writeList(r4)
                java.util.List<com.bxkj.student.run.app.ready.RunRoleSetBean$DataBean$ListBean> r4 = r2.list
                r3.writeList(r4)
                java.util.List<java.util.List<com.bxkj.student.run.app.ready.RunRoleSetBean$DataBean$GeofenceBean>> r4 = r2.geofence
                r3.writeList(r4)
                return
        }
    }

    static {
            com.bxkj.student.run.app.ready.RunRoleSetBean$1 r0 = new com.bxkj.student.run.app.ready.RunRoleSetBean$1
            r0.<init>()
            com.bxkj.student.run.app.ready.RunRoleSetBean.CREATOR = r0
            return
    }

    public RunRoleSetBean() {
            r0 = this;
            r0.<init>()
            return
    }

    protected RunRoleSetBean(android.os.Parcel r2) {
            r1 = this;
            r1.<init>()
            java.lang.Class<com.bxkj.student.run.app.ready.RunRoleSetBean$DataBean> r0 = com.bxkj.student.run.app.ready.RunRoleSetBean.DataBean.class
            java.lang.ClassLoader r0 = r0.getClassLoader()
            android.os.Parcelable r0 = r2.readParcelable(r0)
            com.bxkj.student.run.app.ready.RunRoleSetBean$DataBean r0 = (com.bxkj.student.run.app.ready.RunRoleSetBean.DataBean) r0
            r1.data = r0
            java.lang.String r0 = r2.readString()
            r1.returnCode = r0
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            java.lang.ClassLoader r0 = r0.getClassLoader()
            android.os.Parcelable r2 = r2.readParcelable(r0)
            java.lang.String r2 = (java.lang.String) r2
            r1.returnMsg = r2
            return
    }

    @Override // android.os.Parcelable
    public int describeContents() {
            r1 = this;
            r0 = 0
            return r0
    }

    public com.bxkj.student.run.app.ready.RunRoleSetBean.DataBean getData() {
            r1 = this;
            com.bxkj.student.run.app.ready.RunRoleSetBean$DataBean r0 = r1.data
            return r0
    }

    public java.lang.String getReturnCode() {
            r1 = this;
            java.lang.String r0 = r1.returnCode
            return r0
    }

    public java.lang.Object getReturnMsg() {
            r1 = this;
            java.lang.String r0 = r1.returnMsg
            return r0
    }

    public void setData(com.bxkj.student.run.app.ready.RunRoleSetBean.DataBean r1) {
            r0 = this;
            r0.data = r1
            return
    }

    public void setReturnCode(java.lang.String r1) {
            r0 = this;
            r0.returnCode = r1
            return
    }

    public void setReturnMsg(java.lang.String r1) {
            r0 = this;
            r0.returnMsg = r1
            return
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel r2, int r3) {
            r1 = this;
            com.bxkj.student.run.app.ready.RunRoleSetBean$DataBean r0 = r1.data
            r2.writeParcelable(r0, r3)
            java.lang.String r3 = r1.returnCode
            r2.writeString(r3)
            return
    }
}

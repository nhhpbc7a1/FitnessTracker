── model/
│   ├── health/
│   │   ├── Steps.java
│   │   ├── Calories.java
│   │   └── Workout.java
│   ├── event/
│   │   ├── Appointment.java
│   │   ├── Event.java
│   │   └── Schedule.java
│   ├── media/
│   │   ├── Photo.java
│   │   └── Video.java
│   └── database/           
│       ├── local/
│       │   └── LocalDatabase.java
│       └── cloud/
│           └── CloudDatabase.java
├── view/
│   ├── activities/
│   │   └── MainActivity.java
│   ├── fragments/
│   │   ├── health/
│   │   │   └── HealthFragment.java
│   │   ├── event/
│   │   │   └── EventFragment.java
│   │   └── media/
│   │       └── MediaFragment.java
│   ├── adapters/           
│   │   ├── EventAdapter.java
│   │   ├── WorkoutAdapter.java
│   │   └── MediaAdapter.java
└── controller/
    ├── health/
    │   └── HealthController.java
    ├── event/
    │   └── EventController.java
    ├── media/
    │   └── MediaController.java
    ├── receivers/         
    │   ├── NotificationReceiver.java
    │   ├── BootCompletedReceiver.java
    │   └── ConnectivityReceiver.java
    ├── utils/              
    │   ├── DateTimeUtils.java
    │   ├── NetworkUtils.java
    │   └── PermissionUtils.java
    └── service/            
        ├── SyncService.java
        └── NotificationService.java
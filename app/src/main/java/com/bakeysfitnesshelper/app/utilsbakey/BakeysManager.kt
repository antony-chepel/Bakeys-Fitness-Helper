package com.bakeysfitnesshelper.app.utilsbakey

import com.bakeysfitnesshelper.app.R
import com.bakeysfitnesshelper.app.bakeysdata.BakeysData

object BakeysManager {

   val listAllFit = arrayListOf<BakeysData>(
       // Вид тренировок
       BakeysData(R.drawable.yoga,R.string.vid_fintess_single_title,R.string.yoga_title,R.string.yoga_desc),
       BakeysData(R.drawable.tayzi,R.string.vid_fintess_single_title,R.string.taizi_title,R.string.taizi_desc),
       BakeysData(R.drawable.pilates,R.string.vid_fintess_single_title,R.string.pilates_title,R.string.pilates_desc),
       BakeysData(R.drawable.dance_aerobik,R.string.vid_fintess_single_title,R.string.dance_aero_title,R.string.dance_aero_desc),
       BakeysData(R.drawable.pole_dance,R.string.vid_fintess_single_title,R.string.pole_title,R.string.pole_desc),
       BakeysData(R.drawable.sheyping,R.string.vid_fintess_single_title,R.string.sheyping_title,R.string.sheyping_desc),


       // Тип тренировок
       BakeysData(R.drawable.silovoy_training,
           R.string.type_fintess_single_title,R.string.silovoy_training_title,R.string.silovoy_training_desc),
       BakeysData(R.drawable.base_training,R.string.type_fintess_single_title,R.string.base_training_title,R.string.base_training_desc),
       BakeysData(R.drawable.krug_training,R.string.type_fintess_single_title,R.string.krug_training_title,R.string.krug_training_desc),
       BakeysData(R.drawable.hit_training,R.string.type_fintess_single_title,R.string.hit_training_title,R.string.hit_training_desc),
       BakeysData(R.drawable.obemnuy_training,R.string.type_fintess_single_title,R.string.obem_training_title,R.string.obem_training_desc),


       // Упражнение
       BakeysData(R.drawable.shim_ganteley,R.string.exercise_single_title,R.string.silovoy_training_title,R.string.silovoy_training_desc),
       BakeysData(R.drawable.rasgib_ruk,R.string.exercise_single_title,R.string.razgibanie_title,R.string.razgibanie_desc),
       BakeysData(R.drawable.shim_stoya,R.string.exercise_single_title,R.string.shim_title,R.string.shim_desc),
       BakeysData(R.drawable.low_planka,R.string.exercise_single_title,R.string.low_planka_title,R.string.low_planka_desc),
       BakeysData(R.drawable.visokaya_planka,R.string.exercise_single_title,R.string.high_planka_title,R.string.high_planka_desc),
       BakeysData(R.drawable.most,R.string.exercise_single_title,R.string.most_title,R.string.most_desc),




   )

    val listVidTraining = arrayListOf<BakeysData>(
        BakeysData(R.drawable.yoga,R.string.vid_fintess_single_title,R.string.yoga_title,R.string.yoga_desc),
        BakeysData(R.drawable.tayzi,R.string.vid_fintess_single_title,R.string.taizi_title,R.string.taizi_desc),
        BakeysData(R.drawable.pilates,R.string.vid_fintess_single_title,R.string.pilates_title,R.string.pilates_desc),
        BakeysData(R.drawable.dance_aerobik,R.string.vid_fintess_single_title,R.string.dance_aero_title,R.string.dance_aero_desc),
        BakeysData(R.drawable.pole_dance,R.string.vid_fintess_single_title,R.string.pole_title,R.string.pole_desc),
        BakeysData(R.drawable.sheyping,R.string.vid_fintess_single_title,R.string.sheyping_title,R.string.sheyping_desc),
    )

    val listTypeTraining = arrayListOf<BakeysData>(
        BakeysData(R.drawable.silovoy_training,R.string.type_fintess_single_title,R.string.silovoy_training_title,R.string.silovoy_training_desc),
        BakeysData(R.drawable.base_training,R.string.type_fintess_single_title,R.string.base_training_title,R.string.base_training_desc),
        BakeysData(R.drawable.krug_training,R.string.type_fintess_single_title,R.string.krug_training_title,R.string.krug_training_desc),
        BakeysData(R.drawable.hit_training,R.string.type_fintess_single_title,R.string.hit_training_title,R.string.hit_training_desc),
        BakeysData(R.drawable.obemnuy_training,R.string.type_fintess_single_title,R.string.obem_training_title,R.string.obem_training_desc),
    )

    val listExercises = arrayListOf<BakeysData>(
        BakeysData(R.drawable.shim_ganteley,R.string.exercise_single_title,R.string.silovoy_training_title,R.string.silovoy_training_desc),
        BakeysData(R.drawable.rasgib_ruk,R.string.exercise_single_title,R.string.razgibanie_title,R.string.razgibanie_desc),
        BakeysData(R.drawable.shim_stoya,R.string.exercise_single_title,R.string.shim_title,R.string.shim_desc),
        BakeysData(R.drawable.low_planka,R.string.exercise_single_title,R.string.low_planka_title,R.string.low_planka_desc),
        BakeysData(R.drawable.visokaya_planka,R.string.exercise_single_title,R.string.high_planka_title,R.string.high_planka_desc),
        BakeysData(R.drawable.most,R.string.exercise_single_title,R.string.most_title,R.string.most_desc),
    )
}
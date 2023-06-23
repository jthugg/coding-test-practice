select
    ANIMAL_ID,
    NAME,
    if(
        SEX_UPON_INTAKE in ("Neutered Male", "Spayed Female"),
        "O",
        "X"
    ) as "중성화"
from
    ANIMAL_INS
order by
    ANIMAL_ID
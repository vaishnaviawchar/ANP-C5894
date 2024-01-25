
import { Doctor } from "./doctor";

export class Patient {
    id!: number;
    name!: string;
    password!:string;
    age!: string;
    blood!: string;
    prescription!: string;
    dose!: string;
    fees!: string;
    Remark!:string;
    urgency!:string;
    doctor?:Doctor;

    isRegistered: boolean = false;
  isLoggedIn: boolean = false;
    
}
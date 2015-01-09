#![allow(unstable)]

extern crate time;

use std::num::Float;
use std::num::ToPrimitive;

const TARGET_NUMBER: i32 = 10000;

fn main() {
    // Timer start!
    let start = time::precise_time_ns();
    
    // Smallest prime number
    println!("2");
    
    let mut i = 3;
    
    // Try from 3 to TARGET_NUMBER.
    // And the step is 2.
    // Except 2, any other prime numbers are all odd.
    while i < TARGET_NUMBER {
        
        // Reset in every new loop
        let mut is_prime = true;
        let sqrt = i.to_f64()
		            .unwrap()
					.sqrt()
					.floor()
					.to_i32()
					.unwrap();
        
        // At most check to its sqrt.
        for j in 3..(sqrt + 1) {
            if i % j == 0 {
                is_prime = false;
                break;
            }
        }
        
        if is_prime {
            println!("{}", i);
        }
        
        i += 2;
    }
    
    // Timer stop!
    let end = time::precise_time_ns();
    
    // Count the elapsed time
    let elapsed_time = (end - start) / 1000000;
    
    println!("--------------------------------");
    println!("targetNumber is {}", TARGET_NUMBER);
    println!("elapsedTime is {} ms", elapsed_time);
    println!("--------------------------------");
}